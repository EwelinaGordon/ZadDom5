import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        String[] nameTable = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 imion: ");

        for (int i = 0; i <5; i++) {
            nameTable[i] = scanner.nextLine();
        }

        System.out.println(" ");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Cześć " + nameTable[i]);
        }

    }
}
