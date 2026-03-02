import java.util.Scanner;
import java.time.localtime;
import java.time.period;
//verificar idades
public class us{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String data = sc.nextLine();
        LocalDate nascimento= LocalDate.parse(data);
        int idade = Period.between(nascimento, LocalDate.now()).getYears();
        if (idade >= 18){
            System.out.println("entrada liberada");
        } else {
            System.out.println("entrada negada"); 
        }
    }
}