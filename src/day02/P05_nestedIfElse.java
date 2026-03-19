package day02;

import java.util.Scanner;

public class P05_nestedIfElse {
    public static void main(String[] args) {
    //bir sayı çift ise ve tek basmaklı ise tek basamaklı çift sayı,
    // çift basmaklı ise iki basamaklı çift sayıdır yazdıralım
   //bir sayı tek ise ve tek basmaklı ise tek basamaklı tek sayı,
   // çift basmaklı ise iki basamaklı tek sayıdır yazdıralım
   //sıfır ise sıfırdır yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        int sayi= scan.nextInt();

        if (sayi==0){
            System.out.println("Girilen sayı sıfırdır");
        } else if (sayi%2==0) {
            if (sayi<10){
                System.out.println("Girilen sayı tek basmaklı bir çift sayıdır");
            }else if(sayi>=10 && sayi<100){
                System.out.println("Girilen sayı çift basmaklı bir çift sayıdır");
            }
        }else{
            if (sayi<10){
                System.out.println("Girilen sayı tek basmaklı bir tek sayıdır");
            }else if(sayi>=10 && sayi<100){
                System.out.println("Girilen sayı çift basmaklı bir tek sayıdır");
            }
        }

    }
}
