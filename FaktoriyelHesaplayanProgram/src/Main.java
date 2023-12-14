import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyon Hesaplama");
        System.out.println("-----------------------");

        // Kullanıcıdan n ve r değerlerini al
        System.out.print("n değeri giriniz: ");
        int n = input.nextInt();

        System.out.print("r değeri giriniz: ");
        int r = input.nextInt();

        // Geçersiz giriş kontrolü
        if (r > n || r < 0) {
            System.out.println("Geçersiz giriş. r, n'den büyük veya negatif olamaz.");
        } else {
            // Faktöriyel hesaplamalarını yap
            int totalN = 1, totalR = 1, totalT = 1;
            for (int i = 1; i <= n; i++) {
                totalN *= i; // n faktöriyeli hesaplama
            }
            for (int i = 1; i <= r; i++) {
                totalR *= i; // r faktöriyeli hesaplama
            }
            int t = n - r;
            for (int i = 1; i <= t; i++) {
                totalT *= i; // (n-r) faktöriyeli hesaplama
            }

            // Kombinasyon hesaplama
            int c = totalN / (totalR * totalT);
            System.out.println("Kombinasyon: " + c);
        }
    }
}
