package com.ug5a.soal1;

public class Keyboard {

    private String merkModel;
    private long harga;

    public void setMerkModel(String merkNya) {
        this.merkModel = merkNya;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getMerkModel(){
        return merkModel;
    }

    public Long getHarga() {
        return harga;
    }
}



