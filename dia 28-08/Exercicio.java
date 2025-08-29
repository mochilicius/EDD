package cotroller;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- EXERCÍCIO 1 ----------------
        int[] numeros20 = new int[20];
        int pares = 0, impares = 0;
        System.out.println("\nExercício 1 - Digite 20 números:");
        for (int num : numeros20) {
            numeros20[num] = sc.nextInt();
            if (numeros20[num] % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        // ---------------- EXERCÍCIO 2 ----------------
        int[] numeros10 = new int[10];
        System.out.println("\nExercício 2 - Digite 10 números:");
        for (int i : numeros10) {
            numeros10[i] = sc.nextInt();
        }
        System.out.print("Digite um número para buscar: ");
        int busca = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros10.length; i++) {
            if (numeros10[i] == busca) {
                System.out.println("Número encontrado na posição " + i);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Número não encontrado.");

        // ---------------- EXERCÍCIO 3 ----------------
        String[] nomes = new String[10];
        sc.nextLine(); // limpar buffer
        System.out.println("\nExercício 3 - Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }
        System.out.print("Digite um nome para remover: ");
        String remover = sc.nextLine();
        boolean achouNome = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(remover)) {
                nomes[i] = "---";
                achouNome = true;
            }
        }
        if (!achouNome) System.out.println("Nome não encontrado.");
        System.out.println("Lista final:");
        for (String nome : nomes) System.out.println(nome);

        // ---------------- EXERCÍCIO 4 ----------------
        int[] numeros10b = new int[10];
        System.out.println("\nExercício 4 - Digite 10 números:");
        for (int i = 0; i < numeros10b.length; i++) {
            numeros10b[i] = sc.nextInt();
        }
        System.out.println("Frequência dos números:");
        for (int i = 0; i < numeros10b.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros10b.length; j++) {
                if (numeros10b[i] == numeros10b[j]) contador++;
            }
            System.out.println(numeros10b[i] + " aparece " + contador + " vez(es).");
        }

        // ---------------- EXERCÍCIO 5 ----------------
        int[] numeros10c = new int[10];
        System.out.println("\nExercício 5 - Digite 10 números:");
        for (int i = 0; i < numeros10c.length; i++) {
            numeros10c[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros10c.length - 1; i++) {
            for (int j = 0; j < numeros10c.length - 1 - i; j++) {
                if (numeros10c[j] > numeros10c[j + 1]) {
                    int temp = numeros10c[j];
                    numeros10c[j] = numeros10c[j + 1];
                    numeros10c[j + 1] = temp;
                }
            }
        }
        System.out.println("Array ordenado:");
        for (int n : numeros10c) System.out.print(n + " ");
        System.out.println();

        sc.close();
    }
}
