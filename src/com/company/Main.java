package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            int sayi;
            int count = 0;
            int toplam=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Sayi Giriniz:");
            sayi = sc.nextInt();

            for(int i=0; i<=sayi; i=i+12){
                if(i%12==0){
                    count++;
                    toplam= toplam+i;
                }
            }
            System.out.println(sayi + "'e kadar olan sayiların 12'ye bölünenlerin ortalamasi: ");
            System.out.println((toplam)/(count-1));




        }
    }

