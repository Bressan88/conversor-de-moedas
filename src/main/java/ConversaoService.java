// ============================================================
// > Class: ConversaoService
// > Descricao: Converter moeda base para a requisitada
// > Criado por: Eduardo Bressan
// ============================================================

import com.google.gson.Gson;

public class ConversaoService {

    private final String apiKey = "8e0ffcd9b99ece13cd21539f";
    private final Gson gson = new Gson();

    public double converter (String base, String target, double valor) {
        String url = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/pair/"
                + base + "/"
                + target;

        String json = ApiClient.ChamarApi(url);
        ExchangeResponse resposta = gson.fromJson(json, ExchangeResponse.class);

        if(!"success".equals(resposta.result)) {
            throw new RuntimeException("Erro da API: " + resposta.result);
        }

        return valor * resposta.conversion_rate;
    }
}
