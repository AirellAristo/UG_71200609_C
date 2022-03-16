package com.ug6.soal1;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ){
        System.out.println("====================================================");
        System.out.println("        Buat Vending Machine Terlebih Dahuulu       ");
        System.out.println("====================================================");

        Scanner kapasitas = new Scanner(System.in);
        System.out.println("Kapasitas Maksimal : ");
        int aKapasitas = kapasitas.nextInt();

        System.out.println("Apakah anda akan menambahkan barang sekarang?");
        Scanner pilihan = new Scanner(System.in);
        System.out.println("ya(y) atau tidak(n) : ");
        String aPilihan = pilihan.nextLine();
        if (aPilihan == "y"){
            int b = 1;
            while (b == 1 ){
                Scanner namaBarang = new Scanner(System.in);
                System.out.println("Nama barang : ");
                String aNama = namaBarang.nextLine();
                System.out.println("Tipe barang :");
                System.out.println("1. Minuman");
                System.out.println("2. Makanan");
                System.out.println("3. Produk Digital");
                Scanner jenBar = new Scanner(System.in);
                System.out.println("Pilihan (1/2/3): ");
                String aJenbar = jenBar.nextLine();

                System.out.println("Apakah anda ingin memasukkan nominal harga dan jumlah barang ?");
                Scanner pilihann = new Scanner(System.in);
                System.out.println("ya(y) atau tidak(n) : ");
                String bPilihan = pilihann.nextLine();
                if (bPilihan == "y"){

                    Scanner harga = new Scanner(System.in);
                    System.out.println("Harga Barang :");
                    String aHarga = harga.nextLine();

                    Scanner jumlah = new Scanner(System.in);
                    System.out.println("Kapasitas barang Yang ada/dimiliki :");
                    int aJumlah = jumlah.nextInt();
                    if (aJumlah < aKapasitas){
                            System.out.println("Apakah anda ingin menambah lagi?");
                            Scanner pilihannn = new Scanner(System.in);
                            System.out.println("ya(y) atau tidak(n) : ");
                            String cPilihan = pilihannn.nextLine();
                            if (cPilihan == "y"){

                                Scanner hargaa = new Scanner(System.in);
                                System.out.println("Harga Barang :");
                                String bHarga = hargaa.nextLine();

                                Scanner jumlahh = new Scanner(System.in);
                                System.out.println("Kapasitas barang Yang ada/dimiliki :");
                                String bJumlah = jumlah.nextLine();

                            }
                            else if (cPilihan =="n"){
                                b += 10;
                            }
                        }


                    }
                }
            }











            }
        }


