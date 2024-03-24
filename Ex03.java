import java.util.Scanner;
    public class Ex03 {
        public static void executar() {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o valor de A: ");
            int A = leitor.nextInt();

            System.out.println("Digite o valor de B: ");
            int B = leitor.nextInt();

            if (A != B) {
                if(A > B) {
                    System.out.println("O maior número é: " + A);
                } else {
                    System.out.println("O maior número é: " + B);
                }

            } else{
                System.out.println("A sequencia de numeros informados é invalida, pois os números são iguais.");
            }
            
        }

}
