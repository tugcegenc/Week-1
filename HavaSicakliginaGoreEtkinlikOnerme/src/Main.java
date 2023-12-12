import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sicaklik;

        // Kullanıcıdan sıcaklık bilgisini al
        System.out.print("Sıcaklık Giriniz: ");
        sicaklik = input.nextDouble();

        // Sıcaklık değerine göre etkinlik önerileri yap
        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 25) {
            // Sıcaklık 5 ile 25 arasında ise içerisine gir
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (sicaklik >= 10) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
