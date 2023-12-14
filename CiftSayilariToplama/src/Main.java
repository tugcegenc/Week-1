import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int number;

        do {
            System.out.print("Lütfen bir sayı girin: ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }

        } while (number % 2 == 0); // Kullanıcı tek bir sayı girene kadar devam et

        System.out.println("4'ün katı olan sayıların toplamı: " + total);
    }
}
