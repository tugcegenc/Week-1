import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int n1, n2, select;

        // Kullanıcıdan sayıları ve işlem seçimini alma
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        // Kullanıcıya işlem seçeneklerini gösterme
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        // Seçime göre işlem yapma
        switch (select) {
            case 1:
                System.out.println("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                } else {
                    System.out.println("Hata! Bölen sıfır olamaz.");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}
