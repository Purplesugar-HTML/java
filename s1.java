import java.util.Scanner;
//número por extenso
public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] especiais = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centenas = {"cem"}; // só até 100

        System.out.print("Digite um número entre 1 e 100: ");
        int num = sc.nextInt();

        if (num < 1 || num > 100) {
            System.out.println("Número fora do intervalo!");
        } else if (num == 100) {
            System.out.println("cem");
        } else if (num < 10) {
            System.out.println(unidades[num]);
        } else if (num < 20) {
            System.out.println(especiais[num - 10]);
        } else {
            int dez = num / 10;
            int uni = num % 10;
            if (uni == 0) {
                System.out.println(dezenas[dez]);
            } else {
                System.out.println(dezenas[dez] + " e " + unidades[uni]);
            }
        }
        sc.close();
    }
}
