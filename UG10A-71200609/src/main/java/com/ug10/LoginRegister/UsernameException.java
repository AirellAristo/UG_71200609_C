package com.ug10.LoginRegister;

public class UsernameException extends Throwable {
    private String kalimat ;


    public UsernameException() {
        this.kalimat = "Maaf, Username minimal terdiri dari 6 karakter";
        System.out.println(kalimat);
    }
}
