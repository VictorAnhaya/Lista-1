import java.util.Scanner;

public class Ex19 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o raio do cilindro: ");
        double raio = leitor.nextDouble();
        
        System.out.println("Digite a altura do cilindro: ");
        double altura = leitor.nextDouble();
        
        double volume = 3.14 * Math.pow(raio, 2) * altura;
        
        System.out.println("O volume do cilindro é: " + volume);
        
    }
}

