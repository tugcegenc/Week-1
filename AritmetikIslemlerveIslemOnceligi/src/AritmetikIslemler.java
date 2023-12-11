import java.util.Scanner;

public class AritmetikIslemler {
    public static void main(String[] args) {

        // Scanner sınıfıyla kullanıcıdan alınacak sayıları tanımlama
        Scanner input = new Scanner(System.in);

        System.out.print("a sayısını giriniz: ");
        int a = input.nextInt();

        System.out.print("b sayısını giriniz: ");
        int b = input.nextInt();

        System.out.print("c sayısını giriniz: ");
        int c = input.nextInt();

        // İşlem sırası: a + b * c - b
        int sonuc = a + b * c - b;

        // Sonucun ekrana yazdırılması
        System.out.println("İşlem sırası: a + b * c - b");
        System.out.println("İşlem Sonucu: " + sonuc);
    }
}
