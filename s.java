import java.util.Scanner;
//calculadora simples
public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação: 1-Soma, 2-Subtração, 3-Divisão, 4-Multiplicação");
        int op = sc.nextInt();

        switch (op) {
            case 1: System.out.println("Resultado: " + (n1 + n2)); break;
            case 2: System.out.println("Resultado: " + (n1 - n2)); break;
            case 3: 
                if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Erro: divisão por zero!");
                break;
            case 4: System.out.println("Resultado: " + (n1 * n2)); break;
            default: System.out.println("Operação inválida!");
        }
        sc.close();
    }
}
s