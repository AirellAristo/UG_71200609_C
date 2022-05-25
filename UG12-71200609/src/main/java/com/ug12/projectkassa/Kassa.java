package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
     private HashMap<Produk,Integer> pesanan = new HashMap<Produk,Integer>();
     private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
     private Kasir kasir;

     public Kassa(){
     }

     public void login( String username, String password){
         int o = 0;
         if (arrKasir.get(o).getUsername().equals(username) && arrKasir.get(o).getPassword().equals(password)){
             System.out.println("Login Berhasil!");
             o++;
         }else{
             System.out.println("username/password Anda salah!");
         }
     }

     public void register(Kasir kasir){
         this.arrKasir.add(kasir);

     }

    public void tambahPesanan(Produk produk, int jumlah){
        this.pesanan.put(produk,jumlah);
    }

    public void printNota(){
        System.out.println("============= Nota =============");
        System.out.println("Kasir : " + this.arrKasir.get(0).getUsername());
        System.out.println("No.  Nama Barang      Jumlah    Harga         Sub Total");
        ArrayList<String> x = new ArrayList<String>();
        for ( Produk key : pesanan.keySet() ) {
            x.add(key.getNama());
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        for ( Integer val : pesanan.values() ) {
            b.add(val);
        }
        ArrayList<Long> c = new ArrayList<>();
        for ( Produk harga : pesanan.keySet() ) {
            c.add(harga.getHarga());
        }
        for(int i = 0; i< pesanan.size();i++){
            System.out.println(i+1 + ".   "+x.get(i)+"        "+b.get(i)+"       "+c.get(i)+"       "+c.get(i)*b.get(i));
        }
    }

    public void printPenjualanKasir(){}



}
