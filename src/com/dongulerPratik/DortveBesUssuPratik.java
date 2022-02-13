package com.dongulerPratik;

import java.util.Scanner;

public class DortveBesUssuPratik {
    public static void main(String[] args) {
        int girilenSayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        girilenSayi=sc.nextInt();
        System.out.println("Girdiginiz Sayi: "+girilenSayi);
        for (int i=1; i<=girilenSayi; i=i*4){
            System.out.println("4 Sayisinin Kuvvetleri: "+i);
        }
        System.out.println("---------------------------------");
        for (int i=1; i<=girilenSayi; i=i*5){
            System.out.println("5 Sayisinin Kuvvetleri: "+i);
        }

    }
}
