package com.ug7.ewallet;

public class eWallet extends User{
    private User user;
    private int Saldo;

    public eWallet(User user) {
        super(user.getNama(),user.getEmail(),user.getUang());
    }

    public void topup(int jumlah){

    }

    public void transfer(eWallet eWallet,int jumlah){

    }

    public void withdraw(int jumlah){

    }

    public void getInfo(){


    }

    public int getSaldo(){
        return Saldo;
    }
}
