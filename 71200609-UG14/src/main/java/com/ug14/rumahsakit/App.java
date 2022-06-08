package com.ug14.rumahsakit;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner rm = new Scanner(System.in);
        System.out.println("Masukkan rm baru : ");
        String aRm = rm.nextLine();

        Scanner nama = new Scanner(System.in);
        System.out.println("Masukkan nama anda : ");
        String aNama = nama.nextLine();

        Scanner usia = new Scanner(System.in);
        System.out.println("Masukkan usia anda : ");
        String aUsia = usia.nextLine();

        Scanner alamat = new Scanner(System.in);
        System.out.println("Masukkan alamat anda : ");
        String aAlamat = alamat.nextLine();

        Scanner penyakit = new Scanner(System.in);
        System.out.println("Masukkan penyakit anda : ");
        String aPenyakit = penyakit.nextLine();

        System.out.println("===========================================PROSES INISIALISASI============================================");
        System.out.println();
        Jadwal jadwal = new Jadwal();
        Pasien illegal = new Pasien("test",21,"di mana saja");
        Pelayanan pelayanan = new Pelayanan("Andi");
        Suster suster = new Suster("Siti");
        Dokter dokter = new Dokter("Budi", "Organ Dalam", "A123");
        Pasien pasien = pelayanan.registrasi();

        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL============================================");
        System.out.println();
        suster.screening(illegal, jadwal);
        dokter.memeriksa(illegal, jadwal);

        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES SCREENING SUSTER============================================");
        System.out.println();
        suster.screening(pasien, jadwal);

        System.out.println("===========================================PROSES SCREENING SUTER BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER============================================");
        System.out.println();
        int x = pasien.getLevelPenyakit();
        for(int i = 0; i <= x; i++) {
            dokter.memeriksa(pasien, jadwal);
            dokter.cekStatus(pasien, jadwal);
        }
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER BERHASIL============================================");
        System.out.println();
        DAO.getPasienSembuh();

    }
}
