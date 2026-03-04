import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = entrada.nextInt();
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Senha correta! Bem-vindo!");
    }
}
