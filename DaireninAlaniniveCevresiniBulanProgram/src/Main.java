import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, merkezOlcu; // Yarıçap ve merkez açısının ölçüsü için değişkenler tanımlandı
        double alan, cevre, pi = 3.14, daireDilimi; // Alan, çevre, pi sabiti ve daire dilimi için değişkenler tanımlandı

        Scanner input = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner oluşturuldu
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt(); // Kullanıcıdan dairenin yarıçapını al

        System.out.print("Dairenin Merkez Ölçüsünü Giriniz: ");
        merkezOlcu = input.nextInt(); // Kullanıcıdan dairenin merkez açısının ölçüsünü al

        // Daire diliminin alanını hesapla ve ekrana yazdır
        daireDilimi = (pi * (r * r) * merkezOlcu) / 360;
        System.out.println("Daire Diliminin Alanı: " + daireDilimi);

        // Dairenin çevresini hesapla ve ekrana yazdır
        cevre = (2 * pi * r);
        System.out.println("Dairenin Çevresi: " + cevre);

        // Dairenin alanını hesapla ve ekrana yazdır
        alan = (pi * r * r);
        System.out.print("Dairenin Alanı: " + alan);
    }
}
