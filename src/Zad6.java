import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int x = scanner.nextInt();


        while (x < 100 || x > 200 || x % 3 != 0) {
            if (x < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (x > 200) {
                System.out.println("Podana liczba jest za duża");
            } else {
                System.out.println("Liczba nie jest podzielna przez trzy");
            }
            System.out.println("Podaj liczbę: ");
            x = scanner.nextInt();
        }
        System.out.println("Jest OK");
    }
}
