package com.ug10.LoginRegister;

public class PasswordException extends Throwable {
    private String kalimat;

    public PasswordException(int x) {
        if (x == 1) {
            this.kalimat = "Maaf, Password Minimal 7 karakter!";
        } else if (x == 2) {
            this.kalimat = "Maaf, Password tidak boleh sama dengan Username";
        } else if (x == 3) {
            this.kalimat = "Maaf, Password harus mengandung huruf besar, huruf kecil, simbol dan angka";
        }
        System.out.println(kalimat);
    }
}
