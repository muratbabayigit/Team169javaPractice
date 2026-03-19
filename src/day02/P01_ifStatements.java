package day02;

import java.util.Scanner;

public class P01_ifStatements {
    // Kullanıcıdan  bir sayı alın sayı çift ise sayı çift sayıdır. Tek ise sayı tek sayıdır
    // Sıfır girmişse Sıfır girdiniz yazdırsın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi==0){
            System.out.println("Girilen sayı sıfırdır");
        }

        if (sayi%2==0){
            System.out.println("Girilen "+sayi+" bir çift sayıdır");
        }

        if (sayi%2!=0){
            System.out.println("Girilen "+sayi+" bir tek sayıdır");
        }


    }
}