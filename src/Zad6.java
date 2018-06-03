import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int x = scanner.nextInt();

        while (x<100 || x> 200){
            if(x<100){
           System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj liczbę: ");
                x = scanner.nextInt();
                continue;

          } else if (x > 200) {
           System.out.println("Podana liczba jest za duża");
            System.out.println("Podaj liczbę: ");
            x = scanner.nextInt();
            continue;}

        }

        while (x%3!=0){
            System.out.println("Liczba nie jest podzielna przez 3");
            System.out.println("Podaj liczbę: ");
            x = scanner.nextInt();
            continue;}


        System.out.println("Jest OK");

 }
}
