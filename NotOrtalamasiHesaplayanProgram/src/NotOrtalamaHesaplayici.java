import java.util.Scanner;
public class NotOrtalamaHesaplayici {
    public static void main(String[] args) {

        double mat, fizik, kimya, turkce, tarih, muzik; // double veri türünden altı farklı not değişkeni tanımladık.

        Scanner inp = new Scanner(System.in); // Kullanıcıdan veri alabilmek için Scanner sınıfından bir nesne oluşturduk.

        // Kullanıcıdan notları almak için sırasıyla isteklerde bulunduk.
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextDouble();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextDouble();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextDouble();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextDouble();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextDouble();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik); // Girilen notların toplamını hesapladık.
        double sonuc = toplam / 6.0; // Notların ortalamasını hesapladık.

        // Ortalama notun 60'tan büyük olup olmadığına bağlı olarak öğrencinin sınıfı geçip geçmediğini belirledik.
        String str = sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str); // Sonucu ekrana yazdırdık.
    }
}

