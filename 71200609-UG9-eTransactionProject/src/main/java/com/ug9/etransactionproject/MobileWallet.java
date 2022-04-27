package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp ){
        super(nama,saldo);
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }


    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        long tSaldo = this.getSaldo();
        if (tSaldo <= 0){
            System.out.println("Nominal yang Anda input tidak valid");
        }
        else if(tSaldo < nominal){
            System.out.println("Transfer gagal! saldo Anda tidak mencukupi");
        }
        else {
            long sisaSaldo = tSaldo - nominal;
            this.setSaldo(sisaSaldo);
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }

    }
}
