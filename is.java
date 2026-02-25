import java.time.localtime;
public class is{
    public static void main(String[] args) {
     int hora = localtime.now().gethour();
     if (hora < 12){
        System.out.println("bom dia!");
        } else if (hora < 18) {
        System.out.println("boa tarde!");
        } else if (hora < 22) {
        System.out.println("boa noite!");
        }
        else{ 
            System.out.println("vai dormir!");

        }
    }
}