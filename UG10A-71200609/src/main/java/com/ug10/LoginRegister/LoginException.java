package com.ug10.LoginRegister;

public class LoginException {
    private String kalimat;

    public LoginException() {
        this.kalimat="Maaf, username atau password mu salah";
        System.out.println(kalimat);
    }
}
