import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 5: ");
        int numero = leitor.nextInt();
        
        switch(numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Número inválido!");
        }
        
        
    }
}


