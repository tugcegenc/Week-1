import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir tam sayı girin: ");
        int intNumber = scanner.nextInt();

        System.out.print("Lütfen bir ondalıklı sayı girin: ");
        double decNumber = scanner.nextDouble();

        double intNumberToDouble = intNumber; // Tam sayıyı ondalıklı sayıya dönüştür
        int decNumberToInt = (int) decNumber; // Ondalıklı sayıyı tam sayıya dönüştür

        System.out.println("Girilen tam sayı (" + intNumber + ") ondalıklı sayıya dönüştürüldü: " + intNumberToDouble);
        System.out.println("Girilen ondalıklı sayı (" + decNumber + ") tam sayıya dönüştürüldü: " + decNumberToInt);

        scanner.close();
    }
}
