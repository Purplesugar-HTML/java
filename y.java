import java.time.LocalTime;
//saudação por horário
public class y {
    public static void main(String[] args) {
        int hora = LocalTime.now().getHour();
        if (hora >= 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora < 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Vai dormir!");
        }
    }
}
