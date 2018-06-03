public class Zad2 {
    public static void main(String[] args) {
        int[] intTable = new int[]{3,2,5,6,7};

        int suma = 0;
        for (int i = 0; i<5; i++){
            suma += intTable[i];
            i++;
        }
        System.out.println(suma);
    }
}
