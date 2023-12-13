import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşı girin: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        double fiyat = mesafe * 0.10; // Mesafe başına ücret: 0.10 TL / km

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            if (yas < 12) {
                // 12 yaşından küçükse %50 indirim
                fiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                // 12-24 yaş arasındaysa %10 indirim
                fiyat *= 0.9;
            } else if (yas >= 65) {
                // 65 yaşından büyükse %30 indirim
                fiyat *= 0.7;
            }

            if (yolculukTipi == 2) {
                // Gidiş dönüş seçilmişse %20 indirim
                fiyat *= 0.8;
            }

            System.out.println("Toplam bilet fiyatı: " + fiyat + " TL");
        }
    }
}

