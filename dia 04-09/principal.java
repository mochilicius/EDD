import controle.ControlePessoas;

public class Principal {
    public static void main(String[] args) {
        ControlePessoas controle = new ControlePessoas();
        controle.cadastrarPessoas(); //inicia o metodo de cadastro de pessoas
        controle.exibirMenu(); //abre o menu
    }
}
