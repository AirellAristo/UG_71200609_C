package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }

    public void setSaldo(long buatSaldo){
        this.saldo = buatSaldo;
    }

    public String getNama() {
        return nama;
    }

    public Long getSaldo(){
        return saldo;
    }

    public void topUp(long isiSaldo){
        if (isiSaldo > 0) {
            this.saldo = this.saldo + isiSaldo;
        }
        else{
            System.out.println("Nominal Anda Tidak Valid ! Nominal Harus Lebih dari 0");
        }
    }

    public void bayar(int jumlah,Keyboard x){
        int total;
        int hasil ;
        int xsaldo = (int) this.saldo;
        total =  jumlah * x.getHarga().intValue();
        if (jumlah > 0){
            if (xsaldo > total) {
                this.saldo = xsaldo - total;
                System.out.println("Pembayaran sukses ! Silahkan mengambil"+ x.getMerkModel() + " di counter");}
            else{
                System.out.println("Pembayaran Gagal! Saldo anda kurang, silahkan melakukan top up");}
                }
        else{
            System.out.println("Input Jumlah tidak valid!");
        }
            }
        }
