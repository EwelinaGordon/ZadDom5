public class Zad3 {
    public static void main(String[] args) {

        double suma = 0;

        while (suma <= 3.1) {
            System.out.printf("%.1f ", suma);
            suma += 0.1;
        }
        System.out.printf("\n");

        double suma2 = 0;
        do {
            System.out.printf("%.1f ", suma2);
            suma2 += 0.1;
        }
        while (suma2 <= 3.1);
    }
}

