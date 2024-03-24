import java.util.Scanner;

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = leitor.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int num3 = leitor.nextInt();
        
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println("Os números em ordem crescente são:");
        System.out.println(num1 + ", " + num2 + ", " + num3);
        
        
    }
}

