import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number, tempNumber, basNumber = 0, basValue, result = 0, total = 0;

        System.out.print("Sayı giriniz: ");
        number = inp.nextInt();
        tempNumber = number;

        // Basamak sayısını bulma
        while (tempNumber != 0) {
            basNumber++;
            tempNumber /= 10;
        }

        tempNumber = number; // Orjinal sayıyı tekrar al

        // Her bir basamağın üslerinin toplamını hesaplama
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            int basPow = 1;

            // Basamak değerinin, basamak sayısı kadar üssünü alma
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }

            result += basPow;
            tempNumber /= 10;
            total += basValue;
        }

        // Sonuç, girilen sayıya eşitse Armstrong sayısıdır
        if (result == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
        System.out.println("Basamak sayılarının toplamı: " + total);
    }
}
