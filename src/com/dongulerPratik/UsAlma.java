package com.dongulerPratik;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args){

        int taban,us;
        int toplam=1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Taban Giriniz: ");
    taban= sc.nextInt();
    System.out.print("Üs Giriniz: ");
    us= sc.nextInt();

    for(int i=1; i<=us; i++){
        toplam*=taban;

    }
        System.out.println("Cevap: "+toplam);

}
    }


