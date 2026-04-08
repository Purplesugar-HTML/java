import java.time.LocalTime;
import java.util.Scanner;
public class SaudacaoSistema {
         public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
         String nomeUsuario = leitor.nextLine(); executarSaudacao(nomeUsuario);
        leitor.close();
 }
     public static void executarSaudacao(String nome) {
        int hora = LocalTime.now().getHour();
        String prefixo;
         if (hora >= 5 && hora < 12) {
             prefixo = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
             prefixo = "Boa tarde";
     } else {    
     prefixo = "Boa noite";
 }
        System.out.println( + ", " + nome + "!");
    }
}