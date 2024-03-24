import java.util.Scanner;

public class Ex02 {
    public static void executar() {
      Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

    }
}
