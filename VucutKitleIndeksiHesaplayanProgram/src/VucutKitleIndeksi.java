import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        double kilo, boy, vki;

        // Kullanıcıdan boy ve kilo bilgisini almak için Scanner sınıfı kullanımı
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        // Vücut Kitle İndeksi (VKI) hesaplama
        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
