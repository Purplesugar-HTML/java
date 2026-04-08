import java.util.Scanner;
//maior e menor número
public class es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int maior = n1;
        if (n2 > maior) maior =n2;
        if (n3 > maior) maior = n3;
        int menor =n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        System.out.println("o maior é: " + maior);
        System.out.println("o menor é: " + menor);
        sc.close();
    }
}