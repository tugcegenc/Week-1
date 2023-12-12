import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int km;
        double perkm = 2.20, total, startPrice = 10;

        // Mesafeyi kullanıcıdan alma
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        km = input.nextInt();

        // Taksimetre ücretinin hesaplanması
        total = (km * perkm) + startPrice;

        // Eğer hesaplanan ücret 20 TL'den küçükse, ücreti 20 TL olarak düzeltme
        total = (total < 20) ? 20 : total;

        // Toplam ücretin ekrana yazdırılması
        System.out.println("Toplam Tutar: " + total);
    }
}
