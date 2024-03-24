import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner leitor= new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao;

        if (numero2 != 0) {
            divisao = numero1 / numero2;
        } else {
            divisao = Double.NaN;
            System.out.println("Divisão por zero não é permitida.");
        }

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

       
    }
}



