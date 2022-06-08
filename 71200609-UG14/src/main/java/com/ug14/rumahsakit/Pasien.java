package com.ug14.rumahsakit;

public class Pasien {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String username="root";
    static final String password="";

    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;

    private boolean Status;

    public Pasien(String nama,int usia,String alamat){

    }
    public int getLevelPenyakit() {
        return levelPenyakit;
    }

}
