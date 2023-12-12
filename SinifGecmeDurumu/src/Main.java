import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int mat, fizik, turkce, kimya, muzik;
        int toplam = 0, count = 0, avarage;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan notların alınması
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        // Geçerli notların toplanması ve sayısının hesaplanması
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            count++;
        }

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            count++;
        }

        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            count++;
        }

        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            count++;
        }

        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            count++;
        }

        // Ortalama hesaplaması ve sınıfı geçme durumu
        if (count > 0) {
            avarage = toplam / count;
            System.out.println("Ortalama: " + avarage);
            if (avarage >= 55)
                System.out.println("Sınıfı Geçtiniz, Tebrikler");
            else
                System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Geçerli not girilmedi.");
        }
    }
}
