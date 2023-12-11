import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a, b, c, sonuc;        // değişkenleri tanımlıyoruz.

        System.out.print("a'ya değer giriniz: "); // a değerini alıyoruz.
        a = inp.nextInt();

        System.out.print("b'ya değer giriniz: "); // b değerini alıyoruz.
        b = inp.nextInt();

        System.out.print("c'ya değer giriniz: "); // c değerini alıyoruz.
        c = inp.nextInt();

        sonuc = a + b * c - b;  // gerekli aritmetik işlemi yaptırıyoruz.

        System.out.println("İşlemin Sonucu= " + sonuc);

    }
}