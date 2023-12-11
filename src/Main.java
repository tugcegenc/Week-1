import java.util.Scanner;

//https://github.com/tugberksavas
public class Main {
    public static void main(String[] args) {

        int armut,elma,domates,muz,patlican;
        double arm =2.14, elm =3.67, dom = 1.11, mz = 0.95, pat = 5.0, total;
        boolean kosul1 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kg ? :");
        armut = input.nextInt();

        System.out.print("Kaç kg Elma ? :");
        elma = input.nextInt();

        System.out.print("Kaç kg Domates ? : ");
        domates = input.nextInt();

        System.out.print("Kaç kg Muz ? :");
        muz = input.nextInt();

        System.out.print("Kaç kg Patlıcan ? :");
        patlican = input.nextInt();

        total = ((arm * armut) + (elm * elma) + (dom * domates) + (mz * muz) + (pat * patlican));
        System.out.println("Ödenecek Toplam Tutar .:" + total + "₺");
        kosul1 = (total<20)? true:false;
        System.out.println(kosul1);




    }
}