package day02;

import java.time.LocalDateTime;
import java.util.Scanner;

public class P08_switchCase {
    /*
        Bir bankamatik menüsü ve seçime göre işlem yapan bir JAVA Programı Yazınız

        ========= WISE BANK ATM =========
        ============== MENU =============
            1- Hesap Bakiyesi Göster
            2- Para Çek
            3- Para Yatır
            4- Çıkış

 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("========= WISE BANK ATM =========\n============== MENU =============");
        System.out.println("\t1- Hesap Bakiyesi Göster\n\t2- Para Çek\n\t3- Para Yatır\n\t4- Çıkış");
        System.out.print("Seçiminizi girin: ");
        int bakiye=103762;
        int secim= scan.nextInt();

        switch (secim){
            case 1:
                System.out.print("Hesap bakiyeniz "+bakiye+"₺"); break;
            case 2:
                System.out.print("Çekilecek Tutar: ");
                int cekilen= scan.nextInt();
                System.out.println("Paranızı ilgili bölmeden eksiksiz alınız");
                System.out.println("Çekilen Tutar: "+cekilen+"\nKalan Hesap Bakiyesi: "+(bakiye-cekilen));
                break;
            case 3:
                System.out.print("Yatırılacak miktarı giriniz: ");
                int yatan= scan.nextInt();
                System.out.println("Parayı yatırma bölümüne koyunuz!");
                System.out.println("Paranız sayılıyor...");
                System.out.print("Yatırılan Tutar: "+yatan+"\nKalan Hesap Bakiyesi: "+(bakiye+yatan));
                break;
            case 4:
                System.out.println("İyi Günler Dileriz");
                System.out.println(LocalDateTime.now());
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış Giriş Yaptınız");
        }


    }
}
