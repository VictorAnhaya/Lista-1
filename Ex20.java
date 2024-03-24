import java.util.Scanner;

public class Ex20 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tempo de viagem (em horas): ");
        double tempoViagem = leitor.nextDouble();
        
        System.out.println("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = leitor.nextDouble();
        
        double distancia = tempoViagem * velocidadeMedia;
        
        double consumoVeiculo = 12; 
        double litrosCombustivel = distancia / consumoVeiculo;
        
        System.out.println("Litros de combustível gastos: " + litrosCombustivel);
        
    }
}

