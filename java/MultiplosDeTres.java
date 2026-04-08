import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
