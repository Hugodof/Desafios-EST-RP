import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        do {
            menu();
            op = in.nextInt();
            if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else if (op == 1) {
                // A entrada do valor é feita pelo usuário
                System.out.print("Digite o número que deseja: ");
                int valor = in.nextInt();
                // Chama a função
                fibonacci(valor);
            } else if (op == 2) {
                // A entrada do valor é feita pelo usuário
                System.out.print("Digite a palavra que deseja: ");
                String str = in.next();
                // Chama a função
                buscador(str);
            } else {
                System.out.println("Opção inválida.");
            }

        } while (true);

        in.close();
    }

    public static void menu() {
        System.out.println("Digite"
                + "\n[0] Encerrar o programa"
                + "\n[1] Fibonacci"
                + "\n[2] Buscar 'a'");
    }

    public static void fibonacci(int valor) {
        int ant = 1, prox = 1, aux = 0;

        if (valor <= 0) {
            System.out.println("\nEste número não pertence a Fibonacci.\n");
            return;
        }

        while (true) {
            if (valor == aux || valor == aux) { // True
                System.out.println("\nEste número pertence a Fibonacci!\n");
                break;
            } else if (valor < aux) { // False
                System.out.println("\nEste número não pertence a Fibonacci.\n");
                break;
            } else {
                aux = prox + ant;
                ant = prox;
                prox = aux;
            }
        }
    }

    public static void buscador(String str) {
        int aux = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                aux++;
            }
        }

        if (aux > 0) {
            System.out.println("\nA letra 'a' aparece " + aux + " vezes na String.\n");
        } else {
            System.out.println("\nA letra 'a' não foi encontrada na String.\n");
        }
    }
}