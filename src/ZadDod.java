import java.util.Arrays;
import java.util.Scanner;

public class ZadDod {
    public static void main(String[] args) {
        int[][] table = new int[3][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 9 liczb do tablicy: ");
        table[0][0] = scanner.nextInt();
        table[0][1] = scanner.nextInt();
        table[0][2] = scanner.nextInt();
        table[1][0] = scanner.nextInt();
        table[1][1] = scanner.nextInt();
        table[1][2] = scanner.nextInt();
        table[2][0] = scanner.nextInt();
        table[2][1] = scanner.nextInt();
        table[2][2] = scanner.nextInt();

        System.out.println("Twoja tablica: ");
        System.out.println(Arrays.toString(table[0]));
        System.out.println(Arrays.toString(table[1]));
        System.out.println(Arrays.toString(table[2]));

        int suma0 = table[0][0] + table[0][1] + table[0][2];
        int suma1 = table[1][0] + table[1][1] + table[1][2];
        int suma2 = table[2][0] + table[2][1] + table[2][2];

        int wynik = 0;
        if (suma0 > suma1 && suma0 > suma2) {
            System.out.println("Największa suma liczb jest w wierszu 1 i wymosi " + suma0);
        } else if (suma1 > suma0 && suma1 > suma2) {
            System.out.println("Największa suma liczb jest w wierszu 2 i wymosi " + suma1);
        } else if (suma2 > suma0 && suma2 > suma1){
            System.out.println("Największa suma liczb jest w wierszu 3 i wymosi " + suma2);
        } else System.out.println("W więcej niż jednym wierszu suma liczb jest największa");
    }}