import java.util.Scanner;

public class Ex17 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double peso1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();
        System.out.println("Digite o peso da terceira nota: ");
        double peso3 = leitor.nextDouble();
        
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.printf("Média ponderada: %.2f\n", mediaPonderada);
        
        
    }
}



