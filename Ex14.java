import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro termo (a1) da PA: ");
        int a1 = leitor.nextInt();
        
        System.out.println("Digite a razão (r) da PA: ");
        int r = leitor.nextInt();
        
        System.out.println("Digite o valor de n para encontrar o n-ésimo termo: ");
        int n = leitor.nextInt();
        
        int an = a1 + (n - 1) * r;
        
        System.out.println("O " + n + "-ésimo termo da PA é: " + an);
        
        
    }
}

