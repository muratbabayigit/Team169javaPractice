package day02;

import java.util.Scanner;

public class P07_switchCase {
    //Kullanıcıdan kaçın ayda olduğumuzu öğrenip o ayın ismini yazdırın
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bulunduğumuz ay kaçıncı ay: ");
        int ay= scan.nextInt();

        switch (ay){
            case 1:System.out.println("Ocak Ayındayız");break;
            case 2:System.out.println("Şubat Ayındayız");break;
            case 3:System.out.println("Mart Ayındayız");break;
            case 4:System.out.println("Nisan Ayındayız");break;
            case 5:System.out.println("Mayıs Ayındayız");break;
            case 6:System.out.println("Haziran Ayındayız");break;
            case 7:System.out.println("Temmuz Ayındayız");break;
            case 8:System.out.println("Ağustos Ayındayız");break;
            case 9:System.out.println("Eylül Ayındayız");break;
            case 10:System.out.println("Ekim Ayındayız");break;
            case 11:System.out.println("Kasım Ayındayız");break;
            case 12:System.out.println("Aralık Ayındayız");break;
            default:System.out.println("Bir Yılda 12 Ay Vardır");break;
        }
    }
}
