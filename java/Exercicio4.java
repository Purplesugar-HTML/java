import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notasAlunos = new double[10][4];
        
        // Leitura das notas
        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notasAlunos[i][j] = scanner.nextDouble();
            }
        }
        
        // Processamento e exibição
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RESULTADOS POR ALUNO:");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            double maior = notasAlunos[i][0];
            double menor = notasAlunos[i][0];
            
            for (int j = 0; j < 4; j++) {
                soma += notasAlunos[i][j];
                
                if (notasAlunos[i][j] > maior) {
                    maior = notasAlunos[i][j];
                }
                
                if (notasAlunos[i][j] < menor) {
                    menor = notasAlunos[i][j];
                }
            }
            
            double media = soma / 4;
            
            System.out.printf("Aluno %d - Média: %.2f | Maior: %.2f | Menor: %.2f%n", 
                            (i + 1), media, maior, menor);
        }
        
        scanner.close();
    }
}