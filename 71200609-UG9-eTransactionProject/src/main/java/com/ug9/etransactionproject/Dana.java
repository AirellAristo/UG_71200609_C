package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    private long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        long tSaldo = this.getSaldo();
        if(dp instanceof Ovo){
            System.out.println("Akun Dana tidak valid!");
        }
        else if (nominal <= 0){
            System.out.println("Nominal yang Anda input tidak valid");
        }
        else if (tSaldo <= 0){
            System.out.println("Transfer gagal! saldo Anda tidak mencukupi");
        }
        else if(dp instanceof MobileBanking){
            if (tSaldo > (danaFeeTransferBank+nominal)){
                long sisaSaldo = tSaldo - (nominal + danaFeeTransferBank);
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
