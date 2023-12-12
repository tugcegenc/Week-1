import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç farklı sayı alınıyor
        System.out.print("a sayısı: ");
        a = input.nextInt();

        System.out.print("b sayısı: ");
        b = input.nextInt();

        System.out.print("c sayısı: ");
        c = input.nextInt();

        // Üç sayının karşılaştırması yapılarak küçükten büyüğe sıralama yapılıyor
        if (a < b && a < c) {
            if (b < c)
                System.out.println("a < b < c");
            else {
                System.out.println("a < c < b");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}
