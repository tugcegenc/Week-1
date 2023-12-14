import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        double total = 0;

        for (int i = 1; i <= number; i++) {
            total += 1.0 / i; // Tersini alıp toplama ekliyoruz
        }

        System.out.println("Harmonik seri: " + total);
    }
}
