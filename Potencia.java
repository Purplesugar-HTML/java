import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = entrada.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = entrada.nextInt();

        double resultado = Math.pow(base, expoente);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
