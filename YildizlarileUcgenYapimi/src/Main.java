import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Basamak sayısı giriniz: ");
        n = input.nextInt();

        // Üst yarı oluşturma
        for (int i = 1; i <= n; i++) {
            // Boşlukları ekleme
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekleme
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geç
        }

        // Alt yarı oluşturma
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları ekleme
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekleme
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geç
        }
    }
}
