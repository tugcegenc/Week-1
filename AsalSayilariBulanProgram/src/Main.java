import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Asal sayıları bulma ve ekrana yazdırma
        System.out.println("1 ile " + number + " arasındaki asal sayılar");
        for (int num = 2; num <= number; num++) {
            boolean isPrime = true;

            // Asal sayı kontrolü
            for (int divider = 2; divider < num; divider++) {
                if (num % divider == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
