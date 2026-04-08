import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        
        // Leitura das notas
        System.out.println("Digite 5 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        // Cálculo da média
        double media = soma / notas.length;
        
        // Encontrar maior e menor usando Arrays
        Arrays.sort(notas);
        double menor = notas[0];
        double maior = notas[notas.length - 1];
        
        // Exibir resultados
        System.out.println("\nResultados:");
        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        
        scanner.close();
    }
}