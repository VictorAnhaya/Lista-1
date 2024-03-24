import java.util.Scanner;

public class Ex05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = leitor.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = leitor.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        
    }
}

