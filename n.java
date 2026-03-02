import java.util.Scanner;
//OperacaoCondicional 
public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n2 > n1) {
            System.out.println("Soma: " + (n1 + n2));
        } else if (n1 > n2) {
            System.out.println("Subtração: " + (n1 - n2));
        } else {
            System.out.println("Os números são iguais, não há operação definida.");
        }

        sc.close();
    }
}
