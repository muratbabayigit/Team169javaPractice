package day02;

import java.util.Scanner;

public class P03_ifElseStatements {
    public static void main(String[] args) {
        /* Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55 - 74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 - 94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Tespit edilen hız değeri: ");
        double speed= scan.nextDouble();
        int ceza;

        if (speed<55){
            ceza=0;
        }else if(55<=speed && speed<75) {
            ceza=100;
        }else if (74<speed && speed<85){
            ceza=150;
        }else if(84<speed && speed<95){
            ceza=320;
        } else{
            ceza=500;
        }
        System.out.print("Ehliyetiniz var mı (E/H):");
        char ehliyet=scan.next().toUpperCase().charAt(0);
        
       // if (ehliyet=='E' || ehliyet=='e'){
        if (ehliyet=='E'){
            System.out.println("Ceza Tutarınız : "+ceza+"$");
        } else if (ehliyet=='H') {
            ceza+=200;
            System.out.println("Ceza Tutarınız : "+ceza+"$");
        }else{
            System.out.println("Yanlış giriş yaptınız. Sistemi yeniden çalıştırınız");
        }


    }
}
