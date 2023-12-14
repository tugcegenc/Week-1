import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcı adı ve şifre değişkenlerinin tanımlanması
        String username, password1, password2;
        password1 = "java123"; // Başlangıçta sabit bir şifre atanıyor

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kullanıcı adı ve şifre istenmesi
        System.out.print("Kullanıcı Adınız: ");
        username = input.nextLine();

        System.out.print("Şifreniz: ");
        password2 = input.nextLine();

        // Kullanıcı adı "patika" ve şifre password1 ile uyuşuyorsa giriş yapılır
        if (username.equals("patika") && password2.equals(password1)) {
            System.out.print("Giriş Yaptınız!");
        } else {
            // Yanlış giriş durumunda kullanıcıya şifre sıfırlama seçeneği sunulur
            System.out.println("Bilgileriniz Yanlış!");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String cevap = input.nextLine().toUpperCase();

            if (cevap.equals("E")) {
                // Kullanıcı yeni şifre girer.
                System.out.print("Yeni Şifre: ");
                String yeniSifre = input.nextLine();

                // Yeni şifrenin mevcut şifreyle aynı olup olmadığının kontrolü
                if (yeniSifre.equals(password1)) {
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                } else {
                    // Yeni şifre mevcut şifreden farklıysa şifre güncellenir
                    password1 = yeniSifre;
                    System.out.println("Giriş Başarılı!");
                }
            } else {
                System.out.println("Giriş Sonlandırıldı!");
            }
        }
    }
}
