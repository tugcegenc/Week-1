import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        double armut, elma, domates, muz, patlican;
        double toplam;

        // Kullanıcıdan alınan ürünlerin miktarları
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo?: ");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo?: ");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo?: ");
        muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo?: ");
        patlican = input.nextDouble();

        // Toplam tutarın hesaplanması
        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0);

        // Toplam tutarın ekrana yazdırılması
        System.out.println("Toplam Tutar: " + toplam);
    }
}
