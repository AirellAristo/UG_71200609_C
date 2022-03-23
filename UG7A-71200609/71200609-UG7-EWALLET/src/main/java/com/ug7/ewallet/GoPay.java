package com.ug7.ewallet;

public class GoPay extends eWallet{
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public GoPay(User user) {
        super(user);
    }

    public void topup(int jumlah){
        this.feeTopup = 1000;

    }

    public void transfer(eWallet eWallet, int jumlah){

    }

    public void withdraw(int jumlah) {
        super.withdraw(jumlah);
    }

    public void getInfo(){
        System.out.println("[GoPay e-Wallet]");
        System.out.println("Nama :" +super.getNama());
        System.out.println("Email :" +super.getEmail());
        System.out.println("Uang Cash :" +super.getUang());
        System.out.println("Saldo Ewallet:" + super.getSaldo());
    }
}
