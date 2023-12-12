import java.util.Scanner;

public class MinveMaxDegerleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        // Kullanıcıdan kaç tane sayı gireceğini alır
        System.out.print("Kaç tane sayı gireceksiniz? ");
        n = input.nextInt();

        // Girilen sayı miktarının kontrolü
        if (n <= 0) {
            System.out.println("Hatalı giriş yaptınız veya 0 girdiniz.");
        } else {
            // Girilen sayıları alıp en büyük ve en küçük değerleri bulur
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". Sayı giriniz: ");
                number = input.nextInt();

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            }

            // En büyük ve en küçük sayıları ekrana yazdırır
            System.out.println("En büyük sayı: " + max);
            System.out.println("En küçük sayı: " + min);
        }
    }
}
