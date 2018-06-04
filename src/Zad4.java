import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x: ");
        int x = scanner.nextInt();
        System.out.println("Podaj y: ");
        int y = scanner.nextInt();


        if (x == 0 && y == 0) {
            System.out.println("Początek układu współrzędnych");
        } else if (x > 0 && y > 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w I ćwiartce układu współrzędnych");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w II ćwiartce układu współrzędnych");
        } else if (x < 0 && y < 0) {
                System.out.println("Punkt (" + x + "," + y + ") leży w III ćwiartce układu współrzędnych");
        } else {
            System.out.println("Punkt (" + x + "," + y + ") leży w IV ćwiartce układu współrzędnych");

        }
    }
}
