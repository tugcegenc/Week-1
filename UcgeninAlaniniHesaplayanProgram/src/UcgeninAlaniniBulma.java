import java.util.Scanner;

public class UcgeninAlaniniBulma {
    public static void main(String[] args) {

        double aKenari, bKenari, cKenari, u, alan;
        Scanner girdi = new Scanner(System.in);

        // Kullanıcıdan üç kenar uzunluğunu girmesi isteniyor
        System.out.print("1. Kenarı Giriniz: ");
        aKenari = girdi.nextDouble();

        System.out.print("2. Kenarı Giriniz: ");
        bKenari = girdi.nextDouble();

        System.out.print("3. Kenarı Giriniz: ");
        cKenari = girdi.nextDouble();

        // Üçgenin yarı çevresinin hesaplanması
        u = (aKenari + bKenari + cKenari) / 2;

        // Üçgenin alanının hesaplanması
        alan = Math.sqrt(u * (u - aKenari) * (u - bKenari) * (u - cKenari));


        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println();
    }
}
