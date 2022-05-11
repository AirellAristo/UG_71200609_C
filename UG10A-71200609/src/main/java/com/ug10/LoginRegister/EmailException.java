package com.ug10.LoginRegister;

public class EmailException extends Throwable {
    private String kalimat;

    public EmailException() {
        this.kalimat = "Maaf, email tidak valid";
        System.out.println(kalimat);
    }

}
