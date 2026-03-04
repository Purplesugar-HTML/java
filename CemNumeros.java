import java.util.Scanner;

public class CemNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        for (int i = n; i < n + 100; i++) {
            System.out.println(i);
        }
    }
}
