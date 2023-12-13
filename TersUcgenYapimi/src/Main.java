import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak;

        System.out.print("Basamak sayısını giriniz: ");
        basamak = input.nextInt();

        // Her satır için döngü
        for (int i = basamak; i > 0; i--) {
            // Öncü boşlukları yazdırma
            for (int j = 0; j < basamak - i; j++) {
                System.out.print(" ");
            }
            // Her satır için yıldızları yazdırma
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
