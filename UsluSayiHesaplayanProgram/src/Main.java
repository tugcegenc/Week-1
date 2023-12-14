import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üslü Sayı Hesaplama");
        System.out.println("-------------------");

        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs değeri giriniz: ");
        int power = input.nextInt();

        // Sonucu hesaplama
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base; // Tabanı üs kadar kez kendisiyle çarpma
        }

        // Sonucu ekrana yazdırma
        System.out.println("Sonuç: " + result);

        input.close();
    }
}
