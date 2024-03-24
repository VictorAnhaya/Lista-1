import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double A = leitor.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double B = leitor.nextDouble();
        
        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = leitor.next().charAt(0);
        
        double resultado = 0;
        
        switch(operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador não definido.");
                return;
        }
        
        System.out.println("O resultado da operação é: " + resultado);
        
        
    }
}
