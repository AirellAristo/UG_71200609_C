package com.ug3.soal1;
import java.util.Scanner;

public class UG3no1 {
    public static void main( String[] args ){
        System.out.println("======================Data Product======================");
        System.out.println("Masukkan Data Product Makanan");
        Scanner nama = new Scanner(System.in);
        System.out.println("Nama Makanan:");
        String a = nama.nextLine();
        Scanner tanggal = new Scanner(System.in);
        System.out.println("Tanggal Kadaluarsa:");
        String b = tanggal.nextLine();
        Scanner jumlah = new Scanner(System.in);
        System.out.println("Jumlah Quantity:");
        String c = jumlah.nextLine();
        Scanner berat = new Scanner(System.in);
        System.out.println("Berat (gram):");
        String d = berat.nextLine();

        System.out.println("======================Data Product======================");
        System.out.println("Nama Makanan:" + a);
        System.out.println("Tanggal Kadaluarsa:" + b);
        System.out.println("Jumlah Quantity:" + c);
        System.out.println("Berat (gram):"+ d);
    }

}

