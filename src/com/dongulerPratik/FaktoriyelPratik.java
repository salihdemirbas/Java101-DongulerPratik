package com.dongulerPratik;

import java.util.Scanner;

public class FaktoriyelPratik {
    public static void main(String[] args) {
        int n,r;
        int rToplam=1;
        int nToplam=1;
        int toplam=1;
        System.out.println("N’in r’li kombinasyonunu hesaplama\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayisini giriniz: ");
        n=sc.nextInt();
        System.out.print("R sayisini giriniz: ");
        r=sc.nextInt();

        for(int i=1; i<=n; i++){
            nToplam=i*nToplam;
        }
        for (int i=1; i<=r; i++){
            rToplam=i*rToplam;
        }
        for(int i=1; i<=(n-r); i++){
            toplam=i*toplam;
        }


        int sonuc = nToplam / (rToplam * (toplam));

        System.out.println("C("+n+"/"+r+")="+sonuc);




    }
}
