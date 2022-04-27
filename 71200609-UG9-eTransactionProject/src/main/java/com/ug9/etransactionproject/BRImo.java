package com.ug9.etransactionproject;

public class BRImo extends MobileBanking {

    public BRImo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        long tSaldo = this.getSaldo();
        if (nominal <= 0){
            System.out.println("Nominal yang Anda input tidak valid");
        }
        else if(tSaldo < nominal){
            System.out.println("Transfer gagal! saldo Anda tidak mencukupi");
        }
        else if(dp instanceof BRImo){ // transfer sama bank
            if(tSaldo > nominal){
                long sisaSaldo = tSaldo - nominal;
                this.setSaldo(sisaSaldo);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp,nominal);
            }
        }
        else if(dp instanceof BNImo){ //transfer antar bank
            if(tSaldo > (6000 + nominal)){
                this.setCheckFee(true);
                if (this.isCheckFee() == true){
                    long sisaSaldo = tSaldo - (6000 + nominal);
                    this.setSaldo(sisaSaldo);
                    dp.setSaldo(dp.getSaldo() + nominal);
                    printBuktiTransfer(dp,nominal);
                }
            }
        }
        else if(dp instanceof MobileWallet){
            long sisaSaldo = tSaldo - nominal;
            this.setSaldo(sisaSaldo);
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }
    }

}
