import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3; // kullanıcıya üç hakkı var
        int balance = 1500; // varsayılan hesap bakiyesi
        int select;

        System.out.println("==KODLUYORUZ BANKASINA HOŞGELDİNİZ==");

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) { // kullanıcı adı ve parola kontrolü
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz. ");

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para yatırma\n2-Para çekme\n3-Bakiye sorgula\n4-Çıkış yap");
                    System.out.println("----------------");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price; // para yatırma işlemi
                            break;

                        case 2:
                            System.out.println("Para miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye. Toplam bakiye: " + balance);
                            } else {
                                balance -= price; // para çekme işlemi
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance); // bakiye sorgulama işlemi
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor. İyi günler!");
                            return;

                        default:
                            System.out.println("Geçersiz işlem seçtiniz. Lütfen tekrar deneyin.");
                    }
                } while (true);

            } else {
                right--;
                System.out.println("Kullanıcı adı veya parola hatalı. Kalan hakkınız: " + right);
                if (right == 0) {
                    System.out.println("Hesabınız bloke oldu. Lütfen banka ile iletişime geçin.");
                }
            }
        }
    }
}
