package com.ug13.rumahsakit;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

public class Pelayanan implements Serializable {
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien,Dokter dokter,Jadwal jadwal){}

    public Pasien registrasi()  {
        ArrayList<String> pasien = new ArrayList<String>();
        Scanner nama = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda :");
        String a = nama.nextLine();
        pasien.add(a);

        Scanner usia = new Scanner(System.in);
        System.out.println("Masukkan Usia Anda :");
        String b = usia.nextLine();
        pasien.add(b);

        Scanner alamat = new Scanner(System.in);
        System.out.println("Masukkan Alamat Anda :");
        String c = alamat.nextLine();
        pasien.add(c);

        Scanner penyakit = new Scanner(System.in);
        System.out.println("Masukkan Penyakit Anda :");
        String d = penyakit.nextLine();
        pasien.add(d);

        try ( ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Airell\\Documents\\Tugas Kampus\\Semester 4\\Prak. RPLBO\\UG\\UG13-71200609-RumahSakit\\src\\main\\java\\com\\ug13\\rumahsakit\\test.txt")) ) {
            Pasien aha = new Pasien(pasien.get(0),Integer.parseInt(pasien.get(1)), pasien.get(2));
            System.out.println(aha);
            objOStrm.writeObject(aha);
            objOStrm.flush();
            objOStrm.close();
            System.out.println("======== Proses Registrasi Berhasil ========");
        }
        catch (IOException e) {
            e.printStackTrace();
        }





        return null;
    }
}
