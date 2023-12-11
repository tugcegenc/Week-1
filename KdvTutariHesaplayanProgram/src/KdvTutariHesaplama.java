import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {

        double kdvOrani, tutar, kdvDeger, toplamTutar;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan tutarın alınması
        System.out.print("Tutar giriniz: ");
        tutar = input.nextDouble();

        // KDV Oranının belirlenmesi
        // Eğer tutar 0 ile 1000 arasındaysa KDV oranı %18, değilse %8 olacak
        kdvOrani = (tutar > 0 && tutar < 1000) ? 0.18 : 0.08;


        kdvDeger = kdvOrani * tutar;
        toplamTutar = tutar + kdvDeger;


        System.out.println("Tutar: " + tutar);
        System.out.println("KDV oranı: %" + (kdvOrani * 100));
        System.out.println("KDV değeri: " + kdvDeger);
        System.out.println("Toplam tutar: " + toplamTutar);
    }
}
