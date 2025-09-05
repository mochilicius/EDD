package dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) { // cria a classe pessoa
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters
  // getters servem para descobrir atrbutos de um objeto da classe
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Altura: %.2f m", nome, idade, altura);
    }
}
