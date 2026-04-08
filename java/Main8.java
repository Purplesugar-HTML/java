import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        tamanho(frase);
        entrada.close();
    }
    public static void tamanho(String texto) {
        int quantidade = texto.length();
        System.out.println("A frase digitada tem " + quantidade + " caracteres.");
    }
}