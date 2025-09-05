package controle;

import java.util.Scanner;

public class OrdenaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        double[] precos = new double[10];

        // Lendo os nomes e preços dos produtos
        /*
           - Um laço for (i = 0; i < 10; i++) pede ao usuário o nome e o preço de cada produto.
           - nomes[i] recebe o nome digitado.
           - precos[i] recebe o preço digitado.
           - scanner.nextLine() é usado para consumir a quebra de linha após o preço.
        */
        System.out.println("Digite o nome e preço de 10 produtos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
        }

        // Ordenando com Bubble Sort baseado nos preços (ordem decrescente)
        /*
           - Dois laços for implementam o algoritmo de ordenação Bubble Sort.
           - O laço externo percorre o array de preços, enquanto o laço interno compara preços adjacentes.
           - Simultaneamente, os nomes dos produtos são trocados para manter a associação correta entre nome e preço.
        */
        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - i - 1; j++) {
                if (precos[j] < precos[j + 1]) {
                    // Se o preço atual for menor que o próximo, os preços são trocados.
                    // Troca preços
                    double tempPreco = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = tempPreco;

                    // Troca nomes para manter a associação
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        // Exibindo produtos ordenados do mais caro ao mais barato
        System.out.println("\nProdutos ordenados do mais caro para o mais barato:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i] + " - R$ " + String.format("%.2f", precos[i]));
        }

        scanner.close();
    }
}