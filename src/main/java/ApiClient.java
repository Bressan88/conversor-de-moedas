// ============================================================
// > Class: ApiClient
// > Descricao: Receber url / Acessar API / Retornar resposta
// > Criado por: Eduardo Bressan
// ============================================================

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    public static String ChamarApi(String url) {

        HttpClient cliente = HttpClient.newHttpClient();    // Criando cliente HTTP
        HttpRequest requisicao = HttpRequest.newBuilder()   // Construindo a requisicao
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
            return resposta.body();         // Retorna a resposta da API
        } catch (Exception e) {             // Caso ocorra algum erro
            throw new RuntimeException("Erro ao chamar a API: " + e.getMessage());
        }

    }
}
