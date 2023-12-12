import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;

        // Kullanıcıdan gün ve ay bilgisini alma
        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();


        // Geçerli bir gün ve ay girişi kontrolü
        if ((day > 0 && day <= 31) && (month > 0 && month <= 12)) {
            String burc = "";
            // Burç hesaplama koşulları
            if ((month == 3 && day >= 31) || (month == 4 && day <= 20)) {
                burc = "Koç";
            } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day <= 21)) {
                burc = "Boğa";
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                burc = "İkizler";
            } else if ((month == 6 && day >= 23 && day <= 30) || (month == 7 && day <= 22)) {
                burc = "Yengeç";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                burc = "Aslan";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                burc = "Başak";
            } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day <= 22)) {
                burc = "Terazi";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                burc = "Akrep";
            } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day <= 21)) {
                burc = "Yay";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                burc = "Oğlak";
            } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                burc = "Kova";
            } else if ((month == 2 && day >= 20 && day <= 29) || (month == 3 && day <= 20)) {
                burc = "Balık";
            }

            // Bulunan burcu ekrana yazdırma
            System.out.println("Burcunuz: " + burc);
        } else {
            // Geçersiz tarih girişi durumunda uyarı verme
            System.out.println("Geçersiz tarih girişi.");
        }
    }
}
