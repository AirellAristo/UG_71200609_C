package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama,long saldo,String noRekening ){
        super(nama,saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
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
        else if(tSaldo > (feeAntarBank + nominal)){ //transfer antar bank
            setCheckFee(true);
            if (checkFee == true){
               long sisaSaldo = tSaldo - (feeAntarBank + nominal);
               this.setSaldo(sisaSaldo);
               dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp,nominal);
            }
        }
        else if(tSaldo > nominal){ // transfer sama bank
            long sisaSaldo = tSaldo - nominal;
            this.setSaldo(sisaSaldo);
            printBuktiTransfer(dp,nominal);
        }
    }

    public boolean isCheckFee(){
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

}
