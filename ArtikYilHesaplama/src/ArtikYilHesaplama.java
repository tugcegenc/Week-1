import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        // Kullanıcıdan yıl bilgisini alma
        System.out.print("Yılı giriniz: ");
        year = input.nextInt();

        // Artık yıl hesaplama
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Sonucu ekrana yazdırma
        if (leapYear) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
