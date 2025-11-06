import java.util.*;

public class ExerciciosEstruturaDados {
    public static void main(String[] args) {
            
        // 1.1 Criar e manipular uma LinkedList

        System.out.println("=== 1.1 Criar e manipular LinkedList ===");
        LinkedList<String> alunos = new LinkedList<>();
        
        // a) Adicionar 5 nomes
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");
        alunos.add("Diana");
        alunos.add("Eduardo");
        
        // b) Remover o primeiro nome da lista
        alunos.removeFirst();
        
        // c) Exibir o último nome
        System.out.println("Último nome: " + alunos.getLast());
        
        // d) Exibir todos os nomes
        System.out.println("Todos os alunos:");
        alunos.forEach(System.out::println);
        System.out.println();
        
        
        // 1.2 Inserção em posições específicas

        System.out.println("=== 1.2 Inserção em posições específicas ===");
        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        
        // a) Insira o valor 5 no início
        numeros.addFirst(5);
        
        // b) Insira o valor 60 no final
        numeros.addLast(60);
        
        // c) Insira o valor 25 na posição 3
        numeros.add(3, 25);
        
        // d) Exiba a lista final
        System.out.println("Lista final: " + numeros);
        System.out.println();
        
        
        // 1.3 Remover elementos específicos

        System.out.println("=== 1.3 Remover elementos específicos ===");
        LinkedList<String> lista = new LinkedList<>(Arrays.asList("A", "B", "C", "B", "D"));
        
        // 1. Lista inicial adicionada
        System.out.println("Lista inicial: " + lista);
        
        // 2. Remova apenas a primeira ocorrência de "B"
        lista.remove("B");
        
        // 3. Remova o elemento da posição 2
        lista.remove(2);
        
        // 4. Exiba o resultado
        System.out.println("Lista final: " + lista);
        System.out.println();
        

        // 2. EXERCÍCIOS COM FILA (QUEUE)

        // 2.1 Simulação simples de fila de atendimento
        System.out.println("=== 2.1 Simulação de fila de atendimento ===");
        Queue<String> filaAtendimento = new LinkedList<>();
        
        // a) Adicione 4 pessoas à fila
        filaAtendimento.offer("João");
        filaAtendimento.offer("Maria");
        filaAtendimento.offer("Pedro");
        filaAtendimento.offer("Ana");
        
        // b) Mostre quem é o próximo da fila (peek)
        System.out.println("Próximo da fila: " + filaAtendimento.peek());
        
        // c) Atenda 2 pessoas usando poll
        filaAtendimento.poll();
        filaAtendimento.poll();
        
        // d) Exiba a fila restante
        System.out.println("Fila restante: " + filaAtendimento);
        System.out.println();
        
        
        // 2.2 Controle de pedidos

        System.out.println("=== 2.2 Controle de pedidos ===");
        Queue<String> filaPedidos = new LinkedList<>(Arrays.asList("Pedido1", "Pedido2", "Pedido3"));
        
        // a) Adicione o Pedido4
        filaPedidos.offer("Pedido4");
        
        // b) Atenda dois pedidos
        filaPedidos.poll();
        filaPedidos.poll();
        
        // c) Mostre o tamanho da fila
        System.out.println("Tamanho da fila: " + filaPedidos.size());
        
        // d) Informe se a fila está vazia
        System.out.println("Fila vazia? " + filaPedidos.isEmpty());
        System.out.println();
        

        // 2.3 Verificação de prioridade simples

        System.out.println("=== 2.3 Fila de pacientes ===");
        Queue<String> filaPacientes = new LinkedList<>(Arrays.asList("P1", "P2", "P3", "P4"));
        
        // a) Adicionar P5 no final
        filaPacientes.offer("P5");
        
        // b) Atender 3 pacientes com poll
        filaPacientes.poll();
        filaPacientes.poll();
        filaPacientes.poll();
        
        // c) Mostrar quem será o próximo a ser atendido
        System.out.println("Próximo paciente: " + filaPacientes.peek());
        
        // d) Exibir os pacientes restantes
        System.out.println("Pacientes restantes: " + filaPacientes);
        System.out.println();
        
        
        // 3. EXERCÍCIOS COM PILHA (STACK)
        
        // 3.1 Pilha de navegação (simples)

        System.out.println("=== 3.1 Pilha de navegação ===");
        Stack<String> pilhaNavegacao = new Stack<>();
        
        // a) Empilhe as páginas
        pilhaNavegacao.push("Home");
        pilhaNavegacao.push("Sobre");
        pilhaNavegacao.push("Contato");
        pilhaNavegacao.push("Login");
        
        // b) Mostre a página atual (peek)
        System.out.println("Página atual: " + pilhaNavegacao.peek());
        
        // c) Volte duas páginas usando pop
        pilhaNavegacao.pop();
        pilhaNavegacao.pop();
        
        // d) Exiba a pilha final
        System.out.println("Pilha final: " + pilhaNavegacao);
        System.out.println();
        
        
        // 3.2 Pilha de números

        System.out.println("=== 3.2 Pilha de números ===");
        Stack<Integer> pilhaNumeros = new Stack<>();
        
        // 1. Empilhe os números: 5, 10, 15, 20, 25
        pilhaNumeros.push(5);
        pilhaNumeros.push(10);
        pilhaNumeros.push(15);
        pilhaNumeros.push(20);
        pilhaNumeros.push(25);
        
        // 2. Desempilhe até sobrar apenas dois elementos
        while(pilhaNumeros.size() > 2) {
            pilhaNumeros.pop();
        }
        
        // 3. Mostre o elemento do topo
        System.out.println("Topo: " + pilhaNumeros.peek());
        
        // 4. Mostre o tamanho da pilha
        System.out.println("Tamanho: " + pilhaNumeros.size());
        System.out.println();
        
        
        // 3.3 Verificação de sequência invertida

        System.out.println("=== 3.3 Sequência invertida ===");
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> pilhaInvertida = new Stack<>();
        
        // a) Empilhar todos os elementos
        for(int numero : array) {
            pilhaInvertida.push(numero);
        }
        
        // b) Desempilhar (exibir cada remoção)
        System.out.println("Ordem invertida:");
        while(!pilhaInvertida.empty()) {
            System.out.println(pilhaInvertida.pop());
        }
        
        // c) Verificar que a ordem agora é invertida (5, 4, 3, 2, 1)
        System.out.println();
        

        // 4. EXERCÍCIOS INTEGRADOS

        // 4.1 Sistema de edição de texto com desfazer (undo)

        System.out.println("=== 4.1 Sistema de undo ===");
        Stack<String> pilhaUndo = new Stack<>();
        
        // a) Simule as operações
        pilhaUndo.push("Escrever");
        pilhaUndo.push("Deletar");
        pilhaUndo.push("Formatar");
        
        // b) Desfazer 2 operações
        pilhaUndo.pop();
        pilhaUndo.pop();
        
        // c) Exiba o que ainda está na pilha
        System.out.println("Operações restantes: " + pilhaUndo);
        System.out.println();
        
        
        // 4.2 Controle de ônibus com duas estruturas

        System.out.println("=== 4.2 Controle de ônibus ===");
        Queue<String> filaOnibus = new LinkedList<>(Arrays.asList("P1", "P2", "P3"));
        Stack<String> pilhaMalas = new Stack<>();
        pilhaMalas.push("M1");
        pilhaMalas.push("M2");
        pilhaMalas.push("M3");
        
        // a) Atender 2 pessoas
        filaOnibus.poll();
        filaOnibus.poll();
        
        // b) Guardar 2 malas (remover as 2 últimas)
        pilhaMalas.pop();
        pilhaMalas.pop();
        
        // c) Exibir situação da fila e da pilha
        System.out.println("Fila de pessoas: " + filaOnibus);
        System.out.println("Pilha de malas: " + pilhaMalas);
        System.out.println();
        
        
        // 4.3 Armazenamento híbrido com LinkedList

        System.out.println("=== 4.3 LinkedList híbrida ===");
        LinkedList<String> listaHibrida = new LinkedList<>();
        
        // a) addFirst (comportamento de pilha)
        listaHibrida.addFirst("Início");
        
        // b) addLast (comportamento de fila)
        listaHibrida.addLast("Fim");
        
        // c) offer (comportamento de fila)
        listaHibrida.offer("Meio");
        
        // d) push (comportamento de pilha)
        listaHibrida.push("Topo");
        
        // e) Exiba a lista final
        System.out.println("Lista híbrida final: " + listaHibrida);
    }
}