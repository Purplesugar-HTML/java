import java.util.Scanner;
//operações matemáticas
public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        if (n2 != 0) {
            System.out.println("Divisão: " + (n1 / (double)n2));
        } else {
            System.out.println("Divisão por zero não permitida!");
        }
        sc.close();
    }
}
