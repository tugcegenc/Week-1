import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();
        int total = 0;

        if (number > 0) { // Sayının bölenlerini toplar
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }

            if (total == number) {
                System.out.println(number + " Mükemmel sayıdır.");
            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
            }
        } else {
            System.out.println("Negatif bir sayı mükemmel sayı olamaz.");
            return; // Programı sonlandırır
        }
    }
}
