package controle;

import dominio.Pessoa;
import java.util.Scanner;

public class ControlePessoas {
    private Pessoa[] pessoas;
    private Scanner scanner; // cria scanner para entrada de teto do usuário

    public ControlePessoas() {
        pessoas = new Pessoa[5]; // aloca espaço para 5 objetos pessoa
        scanner = new Scanner(System.in); // tribui variavel ao texto inseido pelo usuario
    }

    public void cadastrarPessoas() {
        System.out.println("Cadastro de 5 pessoas:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nPessoa " + (i + 1)); // 'pessoa 1' , 'PESSOA 2', etc
            System.out.print("Nome: ");
            String nome = scanner.nextLine(); // atribui tudo que usuário escreve até enter a essa variavel string
            System.out.print("Idade: ");
            int idade = scanner.nextInt(); // atribui numero inserido pelo usuario á varial int
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();// atribui numero inserido pelo usuario á varial double (sem decimal)
            scanner.nextLine(); // Consumir a quebra de linha
            pessoas[i] = new Pessoa(nome, idade, altura); // insere dados obtidos a um objeto pessoa
        }
    }

    public void exibirMenu() {
        System.out.println("\nEscolha o tipo de ordenação:");
        System.out.println("1 - Ordem alfabética (nome)");
        System.out.println("2 - Ordem crescente de idade");
        System.out.println("3 - Ordem crescente de altura");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) { // roda funcao que o funcionario escolher
            case 1:
                ordenarPorNome();
                break;
            case 2:
                ordenarPorIdade();
                break;
            case 3:
                ordenarPorAltura();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        listarPessoas();
    }

    private void ordenarPorNome() {
        // pessoa.length = total de pessoas
        for (int i = 0; i < pessoas.length - 1; i++) { // percorre o vetor de pessoas até o penúltimo nome
            for (int j = 0; j < pessoas.length - i - 1; j++) { // em cada nome, compara com o próximo e faz trocas se necessário
                if (pessoas[j].getNome().compareToIgnoreCase(pessoas[j + 1].getNome()) > 0) { 
                    // Se o nome da pessoa atual for "maior" (vem depois no alfabeto), troca de posição
                    Pessoa temp = pessoas[j]; // Guarda temporariamente a pessoa atual
                    pessoas[j] = pessoas[j + 1]; // Move a próxima pessoa para a posição atual
                    pessoas[j + 1] = temp; // Coloca a pessoa guardada na próxima posição
                }
            }
        } 
    }

private void ordenarPorIdade() {
        // pessoa.length = total de pessoas
        for (int i = 0; i < pessoas.length - 1; i++) { // percorre o vetor de pessoas até o penúltimo elemento
            for (int j = 0; j < pessoas.length - i - 1; j++) { // em cada pessoa, compara idade com o próximo e faz trocas se necessário
                if (pessoas[j].getIdade() > pessoas[j + 1].getIdade()) { 
                    // Se a idade da pessoa atual for maior que a próxima, troca de posição
                    Pessoa temp = pessoas[j]; // Guarda temporariamente a pessoa atual
                    pessoas[j] = pessoas[j + 1]; // Move a próxima pessoa para a posição atual
                    pessoas[j + 1] = temp; // Coloca a pessoa guardada na próxima posição
                }
            }
        }
    }

    private void ordenarPorAltura() {
        // pessoa.length = total de pessoas
        for (int i = 0; i < pessoas.length - 1; i++) { // percorre o vetor de pessoas até o penúltimo elemento
            for (int j = 0; j < pessoas.length - i - 1; j++) { // em cada pessoa, compara altura com o próximo e faz trocas se necessário
                if (pessoas[j].getAltura() > pessoas[j + 1].getAltura()) { 
                    // Se a altura da pessoa atual for maior que a próxima, troca de posição
                    Pessoa temp = pessoas[j]; // Guarda temporariamente a pessoa atual
                    pessoas[j] = pessoas[j + 1]; // Move a próxima pessoa para a posição atual
                    pessoas[j + 1] = temp; // Coloca a pessoa guardada na próxima posição
                }
            }
        }
    }
}