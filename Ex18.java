import java.util.Scanner;

public class Ex18 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();
        
         double mediaHarmonica = 3 / ((1/nota1) + (1/nota2) + (1/nota3));
        

        System.out.printf("Média harmônica: %.2f\n", mediaHarmonica);
        
        
    }
}

