package com.ug13.rumahsakit;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Suster {
    private String nama;

    public Suster(String nama){
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal) throws IOException {
        System.out.println(pasien);
        try ( ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("C:\\Users\\Airell\\Documents\\Tugas Kampus\\Semester 4\\Prak. RPLBO\\UG\\UG13-71200609-RumahSakit\\src\\main\\java\\com\\ug13\\rumahsakit\\test.txt")) ) {
            Pasien object2 = (Pasien) objIStrm.readObject();
            if (object2 == pasien){
                System.out.println("ok");
            }else{
                System.out.println("============ ANDA HARUS MELAKUKAN PROSES REGISTRASI TERLEBIH DAHULU ============");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
