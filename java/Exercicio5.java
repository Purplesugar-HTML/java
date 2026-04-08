import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Vetores originais
        int[] vetor10 = new int[10];
        int[] vetor20 = new int[20];
        
        // Leitura do primeiro vetor
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < vetor10.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor10[i] = scanner.nextInt();
        }
        
        // Leitura do segundo vetor
        System.out.println("\nDigite 20 números para o segundo vetor:");
        for (int i = 0; i < vetor20.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor20[i] = scanner.nextInt();
        }
        
        // Criar vetor unido
        int[] vetor30 = new int[30];
        
        // Copiar primeiro vetor
        for (int i = 0; i < vetor10.length; i++) {
            vetor30[i] = vetor10[i];
        }
        
        // Copiar segundo vetor
        for (int i = 0; i < vetor20.length; i++) {
            vetor30[10 + i] = vetor20[i];
        }
        
        // Ordenar usando função
        ordenarVetor(vetor30);
        
        // Mostrar resultados
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Vetor 1 (10 elementos): " + Arrays.toString(vetor10));
        System.out.println("Vetor 2 (20 elementos): " + Arrays.toString(vetor20));
        System.out.println("Vetor unido ordenado (30 elementos): " + Arrays.toString(vetor30));
        
        scanner.close();
    }
    
    public static void ordenarVetor(int[] vetor) {
        // Implementação do algoritmo Bubble Sort
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}