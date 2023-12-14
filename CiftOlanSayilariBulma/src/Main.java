import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        double toplam = 0, count = 0, average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        System.out.print("3 ve 4'e bölünen sayılar: ");

        // Girilen sayıya kadar döngüyü kontrol et
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i; // Bölünebilen sayıları topla
                count++; // Bölünebilen sayı adedini artır

                System.out.print(i + " "); // Bölünebilen sayıları ekrana yazdır
            }
        }
        System.out.println(); // Alt satıra geçmek için

        // Eğer en az bir bölünebilen sayı bulunduysa
        if (count > 0) {
            average = toplam / count; // Ortalama hesapla
            System.out.println("3 ve 4'e bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e bölünen sayı bulunamadı.");
        }
    }
}
