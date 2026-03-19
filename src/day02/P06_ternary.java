package day02;

import java.util.Scanner;

public class P06_ternary {
    public static void main(String[] args) {
       /*
    Bir e-ticaret sitesinde sipariş veren müşterinin
    kargo ücretini hesaplayan bir Java programı yazınız.
        Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
        Eğer sipariş tutarı 500 TL’nin altında ise:
        VIP müşteri olup olmadığı kontrol edilir.
        VIP müşteri ise kargo ücreti 10 TL.
        VIP müşteri değilse kargo ücreti 30 TL.
*/
        Scanner scan=new Scanner(System.in);
        System.out.print("Sipariş Tutarı: ");
        double tutar= scan.nextDouble();
        System.out.print("Müşterinin Vip Kartı Var mı? (E/H): ");
        char vip=scan.next().toUpperCase().charAt(0);
        int kargoUcreti;

        kargoUcreti=(tutar >= 500) ? 0 : (vip == 'E' ? 10 : 30);
        System.out.println("Kargo Ücreti="+kargoUcreti);
        System.out.println("Vergi: "+((tutar+kargoUcreti)*0.18));
        System.out.println("Ödenecek Tutar: "+(tutar+kargoUcreti+(tutar+kargoUcreti)*0.18));




    }
}
