package day02;

import java.util.Scanner;

public class P04_artikYil {
    public static void main(String[] args) {
    /*
        Girilen yılın artık yıl olup olmadığını bulunuz
        Şartlar:
        Artık yıl
        4'e bölünen ama 100'e bölünmeyen yıllardır
        100'e bölünen yıllardan aynı zamanda 400' e de bölünebilen yıllardır
    */

        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol edilecek yılı giriniz: ");
        int year= scan.nextInt();

        if (year%100==0 && year%400==0){
            System.out.println(year+" yılı bir artık yıldır");
        }else if(year%100!=0 && year%4==0){
            System.out.println(year+" yılı bir artık yıldır");
        }else{
            System.out.println(year+" yılı bir artık yıl değildir");
        }

    }
}
