package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(User user) {
        super(user);
    }

    public void topup(int jumlah){
        int a = jumlah;
        this.feeTopup = 500;
        int x = super.getUang() - feeTopup;


    }

    public void transfer(eWallet eWallet, int jumlah){

    }

    public void withdraw(int jumlah) {
      this.feeWithdraw = 1000;
      int x = jumlah + feeWithdraw ;
    }

    public void getInfo(){
        System.out.println("[ShopeePay e-Wallet]");
        System.out.println("Nama :" +super.getNama());
        System.out.println("Email :" +super.getEmail());
        System.out.println("Uang Cash :" +super.getUang());
        System.out.println("Saldo Ewallet:" + super.getSaldo());
    }

    public String getName(){
        return super.getNama();
    }
}

