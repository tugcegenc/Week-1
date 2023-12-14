import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int number = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1, nextNumber;

        System.out.println("Fibonacci Serisi");
        System.out.println("-----------------");
        for (int i = 1; i <= number; i++) {
            System.out.print(firstNumber + " "); // Her adımda bir önceki sayıyı yazdır

            nextNumber = firstNumber + secondNumber; // Ardışık iki sayının toplamı yeni sayıyı oluşturur
            firstNumber = secondNumber; // Yeni sayıyı hesaplamak için bir önceki sayıları güncelle
            secondNumber = nextNumber;
        }
    }
}
