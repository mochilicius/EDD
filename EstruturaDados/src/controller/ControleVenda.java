package controller;

import java.text.DecimalFormat;
import java.util.Scanner;

import dominio.Produto;

public class ControleVenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        Produto[] vendas = new Produto[5]; // Array para armazenar 5 vendas

        // Cadastro de 5 vendas
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCadastro da Venda " + (i + 1));
            System.out.print("Digite o número da venda: ");
            int numero = sc.nextInt();

            System.out.print("Digite a quantidade de produtos: ");
            int quantidade = sc.nextInt();

            System.out.print("Digite o valor unitário do produto: ");
            double valorUnitario = sc.nextDouble();

            vendas[i] = new Produto(numero, quantidade, valorUnitario);
        }

        // Listando as vendas cadastradas
        System.out.println("\n--- Lista de Vendas ---");
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("\nDados da venda " + (i + 1) + ":");
            System.out.println("Número da venda: " + vendas[i].getNumero());
            System.out.println("Quantidade de produtos: " + vendas[i].getQuantidade());
            System.out.println("Valor unitário: R$ " + df.format(vendas[i].getValorUnitario()));
            System.out.println("Valor total a pagar: R$ " + df.format(vendas[i].valorPagar()));
        }

        sc.close();
    }
}