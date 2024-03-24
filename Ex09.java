import java.util.Scanner;
    public class Ex09 {
        public static void executar() {
            Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = leitor.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int B = leitor.nextInt();
        
        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (A > B) {
                System.out.println("O número " + A + " é maior que " + B);
            } else {
                System.out.println("O número " + B + " é maior que " + A);
            }
        }
        
   
    }
}
            
        

