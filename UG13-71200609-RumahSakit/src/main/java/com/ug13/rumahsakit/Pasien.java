package com.ug13.rumahsakit;

import java.io.Serializable;

public class Pasien implements Serializable {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private String status = "False";

    public Pasien(String nama,int usia,String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }



}


