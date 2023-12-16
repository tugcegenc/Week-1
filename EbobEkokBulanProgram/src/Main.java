import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = inp.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = inp.nextInt();

        int ebob = 1; // En büyük ortak bölen için bir başlangıç değeri atanıyor
        int i = 1; // Bölenleri kontrol etmek için kullanılacak olan sayıcı

        // En büyük ortak bölenin hesaplanması
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i; // Eğer i, n1 ve n2'ye tam olarak bölünebiliyorsa, ebob değeri güncelleniyor
            }
            i++; // Sayacın artırılması, bir sonraki böleni kontrol etmek için
        }

        int ekok = (n1 * n2) / ebob; // En küçük ortak kat hesaplanıyor


        System.out.println("------------");
        System.out.println("EBOB değeri: " + ebob);
        System.out.println("------------");
        System.out.println("EKOK değeri: " + ekok);
        System.out.println("------------");

    }
}
