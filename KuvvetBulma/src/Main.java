import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        do {
            // Kullanıcıdan pozitif bir sayı iste
            System.out.print("Bir pozitif sayı giriniz: ");
            number = input.nextInt();
        } while (number <= 0); // Kullanıcı negatif veya sıfır girdiği sürece tekrar iste

        // 4'ün kuvvetlerini hesapla ve ekrana yazdır
        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i < number; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 5'in kuvvetlerini hesapla ve ekrana yazdır
        System.out.print("5'in kuvvetleri: ");
        for (int i = 1; i < number; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
