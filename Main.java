import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o número que deseja: ");
        int valor = in.nextInt();

        boolean resultado = fibonacci(valor);

        if(resultado==true){
            System.out.println("Este número pertence a Fibonacci!");
        }else{
            System.err.println("Este número não pertence a Fibonacci.");
        }
    }

    public static boolean fibonacci(int valor){
        int ant=1, prox=1, aux=0;

        if(valor<=0){
            return false;
        }

        while(true){
            if(valor==aux || valor==aux){
                return true;
            }else if(valor<aux){
                return false;
            }else{
                aux = prox + ant;
                ant = prox;
                prox = aux;
            }
        }
    }
}