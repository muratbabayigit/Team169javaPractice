package day01;

import java.util.Scanner;

public class P02_kullanicidanDegerAlma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Adınızı ve Soyadınızı Yazınız: ");
        String name=scan.nextLine();
        System.out.print("Yaşınızı Yazınız: ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.print("Mesleğinizi Yazınız:  ");
        String meslek=scan.nextLine();
        System.out.print("Memleketinizi yazınız:   ");
        String memleket=scan.nextLine();
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println(meslek);
        System.out.println("Adınız: "+name+"\nYaşınız:"+age+"\nMesleğiniz: "+meslek+"\nMemleketiniz: "+memleket);




    }
}
