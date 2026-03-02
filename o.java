import java.util.Scanner;
//resto da divisão
public class o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n2 != 0) {
            System.out.println("Resto da divisão: " + (n1 % n2));
        } else {
            System.out.println("Não é possível dividir por zero!");
        }
        sc.close();
    }
}
