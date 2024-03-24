import java.util.Scanner;
     public class Ex15{
        public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas do ponto P1 (x1 y1): ");
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        
        System.out.println("Digite as coordenadas do ponto P2 (x2 y2): ");
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();
        
    
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        
        System.out.println("Distância entre os pontos: " + distancia);
        
    
    }
}

     

