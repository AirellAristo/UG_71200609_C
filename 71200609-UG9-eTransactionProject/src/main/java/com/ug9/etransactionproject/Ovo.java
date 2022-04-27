package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        long tSaldo = this.getSaldo();
        if (nominal <= 0){
            System.out.println("Nominal yang Anda input tidak valid");
        }
        else if(dp instanceof Dana){
            System.out.println("Akun Ovo tidak valid!");
        }
        else if (tSaldo <= 0){
            System.out.println("Transfer gagal! saldo Anda tidak mencukupi");
        }
        else if(dp instanceof MobileBanking){
            if (tSaldo > (ovoFeeTransferBank+nominal)){
                long sisaSaldo = tSaldo - (nominal + ovoFeeTransferBank);
                this.setSaldo(sisaSaldo);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp, nominal);
            }
            else{
                System.out.println("Transfer gagal! saldo Anda tidak mencukupi");
            }
        }
        else{

            if(tSaldo > nominal){
                long sisaSaldo = tSaldo - nominal ;
                this.setSaldo(sisaSaldo);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp, nominal);
            }
            else{
                System.out.println("Transfer gagal! saldo Anda tidak mencukupi");
            }
        }
    }

}
