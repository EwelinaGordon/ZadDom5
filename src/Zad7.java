import java.util.Arrays;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        String[] nameTable = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 imion: ");
        nameTable[0] = scanner.nextLine();
        nameTable[1] = scanner.nextLine();
        nameTable[2] = scanner.nextLine();
        nameTable[3] = scanner.nextLine();
        nameTable[4] = scanner.nextLine();

        System.out.println(" ");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Cześć " + nameTable[i]);
        }

    }
}
