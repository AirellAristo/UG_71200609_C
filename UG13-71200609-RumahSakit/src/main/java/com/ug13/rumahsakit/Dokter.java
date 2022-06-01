package com.ug13.rumahsakit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dokter {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }


    public void memeriksa(Pasien pasien,Jadwal jadwal){
        try ( ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("C:\\Users\\Airell\\Documents\\Tugas Kampus\\Semester 4\\Prak. RPLBO\\UG\\UG13-71200609-RumahSakit\\src\\main\\java\\com\\ug13\\rumahsakit\\test.txt")) ) {
            Pasien object2 = (Pasien) objIStrm.readObject();
            if (object2.equals(pasien)){
                System.out.println("ok");
            }else{
                System.out.println("============ ANDA HARUS MELAKUKAN PROSES REGISTRASI TERLEBIH DAHULU ============");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void cekStatus(Pasien pasien){
    }
}
