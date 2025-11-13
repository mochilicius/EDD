import java.util.*;

public class MainLab {

    public static void main(String[] args) {
        System.out.println("=== Atividade de Laboratório: Coleções, Pilhas, Filas, e mais ===\n");
        // Bloco A: Collections & List
        blocoA();
        // Bloco B: Stack (LIFO)
        blocoB();
        // Bloco C: Queue & PriorityQueue
        blocoC();
        // Bloco D: Set & Map
        blocoD();
        // Bloco E: Lista Encadeada e Árvore de Busca
        blocoE();
    }

    // Bloco A — Collections & List
    private static void blocoA() {
        System.out.println("\n--- Bloco A: Collections & List ---");

        // Tarefa A1 - Exibir lista original antes das operações
        System.out.println("-> A1 List<Integer>");
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 9);
        System.out.println("Lista original: " + numeros);

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);

        int posicao = Collections.binarySearch(numeros, 8);
        System.out.println("Posição do número 8: " + posicao);

        Collections.reverse(numeros);
        System.out.println("Lista invertida: " + numeros);

        Collections.shuffle(numeros);
        System.out.println("Lista embaralhada: " + numeros);

        // Tarefa A2 - Exibir listas originais antes das operações
        System.out.println("\n-> A2: Operações em List<String>");
        List<String> l1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        List<String> l2 = Arrays.asList("C#", "Java", "Go");
        System.out.println("Lista original l1: " + l1);
        System.out.println("Lista original l2: " + l2);

        Collections.addAll(l1, "Kotlin", "Swift");
        System.out.println("Lista l1 após adicionar 'Kotlin' e 'Swift': " + l1);

        int freq = Collections.frequency(l1, "Java");
        System.out.println("Frequência de 'Java' em l1: " + freq);

        boolean disjuntas = Collections.disjoint(l1, l2);
        System.out.println("As listas l1 e l2 são disjuntas? " + disjuntas);

        System.out.println("Mínimo: " + Collections.min(numeros) + ", Máximo: " + Collections.max(numeros));
    }

    // Bloco B — Stack (LIFO)
    private static void blocoB() {
        System.out.println("\n--- Bloco B: Stack (LIFO) ---");

        // Tarefa B1 - Exibir expressões originais antes da validação
        System.out.println("-> B1 Verificador de parênteses balanceados");
        List<String> expressoes = Arrays.asList("((2+3)*(4-1))", ")(2+3)(", "(1+(2*3)");
        System.out.println("Expressões originais: " + expressoes);
        for (String expr : expressoes) {
            System.out.println("Expressão: " + expr + " - " + (verificarParenteses(expr) ? "Balanceada" : "Desbalanceada"));
        }

        // Tarefa B2 - Exibir palavra original antes da inversão
        System.out.println("\n-> B2: Inverter palavra");
        String palavra = "ALGORITMO";
        System.out.println("Palavra original: " + palavra);
        String invertida = inverterPalavra(palavra);
        System.out.println("Palavra invertida: " + invertida);
    }

    private static boolean verificarParenteses(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
        }
        return stack.isEmpty();
    }

    private static String inverterPalavra(String palavra) {
        Stack<Character> stack = new Stack<>();
        for (char ch : palavra.toCharArray()) stack.push(ch);

        StringBuilder invertida = new StringBuilder();
        while (!stack.isEmpty()) invertida.append(stack.pop());
        return invertida.toString();
    }

    // Bloco C — Queue & PriorityQueue
    private static void blocoC() {
        System.out.println("\n--- Bloco C: Queue & PriorityQueue ---");

        // Tarefa C1 - Exibir estado da fila antes de cada operação
        System.out.println("-> C1: Fila de impressão com Queue<String>");
        Queue<String> fila = new LinkedList<>();
        fila.offer("Doc1");
        fila.offer("Doc2");
        fila.offer("Doc3");
        System.out.println("Fila inicial: " + fila);

        fila.poll();
        System.out.println("Fila após remover o primeiro elemento: " + fila);

        fila.poll();
        System.out.println("Fila após remover o segundo elemento: " + fila);

        fila.offer("Doc4");
        System.out.println("Fila após adicionar 'Doc4': " + fila);

        // Tarefa C2 - Exibir PriorityQueue original
        System.out.println("\n-> C2: PriorityQueue<Integer>");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(40);
        System.out.println("PriorityQueue inicial (antes das operações): " + priorityQueue);

        System.out.println("Menor elemento (peek): " + priorityQueue.peek());
        System.out.println("Removendo elementos da fila com prioridade (ordem crescente):");
        while (!priorityQueue.isEmpty()) {
            Integer menor = priorityQueue.poll();
            System.out.println("Elemento removido: " + menor + " | PriorityQueue restante: " + priorityQueue);
        }
    }

    // Bloco D — Set & Map
    private static void blocoD() {
        System.out.println("\n--- Bloco D: Set & Map ---");

        // Tarefa D1 - Exibir conjuntos antes das operações
        System.out.println("-> D1: Trabalhando com HashSet e TreeSet");
        System.out.println("** HashSet não garante ordem; TreeSet ordena automaticamente. **");

        
        List<String> linguagensOriginais = Arrays.asList("Java", "Python", "C++", "Java");
        System.out.println("** Lista original (com duplicatas): " + linguagensOriginais);
        HashSet<String> linguagens = new HashSet<>(Arrays.asList("Java", "Python", "C++", "Java"));
        System.out.println("HashSet inicial: " + linguagens);

        System.out.println("** Lista inserida no TreeSet -> (10, 5, 8, 1)");
        TreeSet<Integer> numeros = new TreeSet<>(Arrays.asList(10, 5, 8, 1));
        System.out.println("TreeSet inicial: " + numeros);
        System.out.println("(valores menores) headSet(8): " + numeros.headSet(8));
        System.out.println("(valores maiores) tailSet(8): " + numeros.tailSet(8));


        // Tarefa D2 - Exibir mapas antes das operações
        System.out.println("\n-> D2: Trabalhando com Map e TreeMap");
        Map<String, Integer> notas = new HashMap<>();

        // Inserindo pares chave-valor e exibindo o estado após cada inserção
        notas.put("Ana", 90);
        System.out.println("HashMap após adicionar 'Ana': " + notas);
        notas.put("Carlos", 80);
        System.out.println("HashMap após adicionar 'Carlos': " + notas);
        notas.put("Bianca", 85);
        System.out.println("HashMap após adicionar 'Bianca': " + notas);

        // Exibindo o mapa final antes e depois de ordenar
        System.out.println("Mapa (HashMap): " + notas);
        // Exibindo a nota da "Ana"
        System.out.println("Nota da Ana: " + notas.get("Ana"));
        // Exibindo o conjunto de chaves (keySet)
        System.out.println("Conjunto de chaves (keySet): " + notas.keySet());
        // Exibindo o tamanho do mapa (size)
        System.out.println("Tamanho do mapa: " + notas.size());
        System.out.println("**OBS: A ordem exibida no HashMap não é garantida. Aqui, ela parece ordenada porque as chaves foram inseridas em ordem alfabética, mas "
        + "internamente não há garantia de ordenação.");

        TreeMap<String, Integer> treeNotas = new TreeMap<>(notas);
        System.out.println("TreeMap ordenado: " + treeNotas);
        System.out.println("**OBS: O TreeMap organiza suas chaves automaticamente em ordem natural (alfabética, neste caso). "
        + "Por isso, sua saída é sempre ordenada, independentemente da ordem de inserção.");
    }

    // Bloco E — Lista Encadeada & Árvore de Busca
    private static void blocoE() {
        System.out.println("\n--- Bloco E: Lista Encadeada & Árvore de Busca ---");

        // Tarefa E1 - Exibir LinkedList antes e após cada operação
        System.out.println("-> E1: Lista Encadeada com LinkedList");
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addFirst(1);
        lista.addLast(5);
        lista.addFirst(3);
        lista.addLast(7);
        System.out.println("Lista inicial: " + lista);

        lista.removeFirst();
        System.out.println("Lista após remover do início: " + lista);

        lista.removeLast();
        System.out.println("Lista após remover do fim: " + lista);

        // Tarefa E2 -- Árvore de Busca
        System.out.println("\n--- Bloco E2: Árvore de Busca Binária ---");
        BST bst = new BST();

        // Inserções na BST
        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int valor : valores) {
            bst.insert(valor);
        }

        // Percursos
        System.out.print("In-Order: ");
        bst.inOrder();

        System.out.print("Pre-Order: ");
        bst.preOrder();

        System.out.print("Post-Order: ");
        bst.postOrder();
    }

    static class BST {
        static class Node { int v; Node l, r; Node(int v) { this.v = v; } }
        Node r;
        void insert(int v) { r = insert(r, v); }
        Node insert(Node n, int v) {
            if (n == null) return new Node(v);
            if (v < n.v) n.l = insert(n.l, v);
            else if (v > n.v) n.r = insert(n.r, v);
            return n;
        }
        void inOrder() { inOrder(r); System.out.println(); }
        void preOrder() { preOrder(r); System.out.println(); }
        void postOrder() { postOrder(r); System.out.println(); }
        void inOrder(Node n) { if (n != null) { inOrder(n.l); System.out.print(n.v + " "); inOrder(n.r); } }
        void preOrder(Node n) { if (n != null) { System.out.print(n.v + " "); preOrder(n.l); preOrder(n.r); } }
        void postOrder(Node n) { if (n != null) { postOrder(n.l); postOrder(n.r); System.out.print(n.v + " "); } }
    }
}
