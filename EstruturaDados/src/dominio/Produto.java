package dominio;

public class Produto {
    private int numero;
    private int quantidade;
    private double valorUnitario;

    // Construtor para inicializar os atributos
    public Produto(int numero, int quantidade, double valorUnitario) {
        this.numero = numero;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    // Método para calcular o valor total a pagar
    public double valorPagar() {
        return quantidade * valorUnitario;
    }
}
