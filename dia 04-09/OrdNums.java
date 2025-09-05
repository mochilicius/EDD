package controle;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        // o for abaixo lê 10 números inteiros do usuário e os armazena no array 'numeros'
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt(); 
            // le um número inteiro e armazena na posição i do array    
        }

        // Implementação do Bubble Sort para ordenar os números em ordem crescente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) { // compara números adjacentes
                    // Se o número atual for maior que o próximo, os números são trocados.
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) { // para cada número no array 'numeros', leia como "x em numeros"
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}