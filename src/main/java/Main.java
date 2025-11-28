// ============================================================
// > Challenge: Conversor de Moedas - Aluna ONE
// > Criado por: Eduardo Bressan
// ============================================================

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<String> historico = new ArrayList<>();

    public static void main(String[] args) {
        // VARIAVEIS
        Scanner leitura = new Scanner(System.in);
        ConversaoService conversor = new ConversaoService();
        int opcao = 0;

        while (opcao != 1) {
            System.out.println("===========================================");
            System.out.println("> CONVERSOR DE MOEDAS");
            System.out.println("===========================================");
            System.out.println("1) Sair");
            System.out.println("2) Dólar ----------------> Peso argentino");
            System.out.println("3) Peso argentino -------> Dólar");
            System.out.println("4) Peso argentino -------> Dólar");
            System.out.println("5) Peso argentino -------> Dólar");
            System.out.println("6) Peso argentino -------> Dólar");
            System.out.println("7) Peso argentino -------> Dólar");
            System.out.println("8) Peso argentino -------> Dólar");
            System.out.print("Escolha uma opção válida: ");

            if (opcao == 1) {
                System.out.println("Encerrando...");
            }
        }
    }
}