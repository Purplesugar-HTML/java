import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int resultado = inverter(numero);
        System.out.println("O inverso de " + numero + " é: " + resultado);
        entrada.close();
    }
    public static int inverter(int num) {
        int invertido = 0;
        while (num != 0) {
            int ultimo = num % 10;       
            invertido = invertido * 10 + ultimo; 
            num = num / 10;              
        }
        return invertido;
    }
}