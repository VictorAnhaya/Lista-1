import java.util.Scanner;
    public class Ex08 {
        public static void executar() {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = leitor.nextInt();

            if (numero >= 50) {
                System.out.println("O número é maior ou igual a 50.");

            } else{
                System.out.println("O número é menor que 50.");

            }


            
        }

}
