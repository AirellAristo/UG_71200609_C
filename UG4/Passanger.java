package com.ug4.soal1;

public class Passanger {
    private String name;
    private double balance;
    private String email;
    private String destiny;

    public String getName(){
        return name;
        }

    public void setName(String namaPassanger){
        name = namaPassanger;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String buatEmail){
        email = buatEmail;
    }

    public String getDestiny(){
        return destiny;
    }

    public void setDestiny(String buatDestiny){
        destiny = buatDestiny;
    }
}
