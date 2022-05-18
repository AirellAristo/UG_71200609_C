package com.ug11.instapost;

public class EmailException extends Throwable {
    private String errorMessage;
    private int errorCode;


    public EmailException(int errorCode) {
        this.errorCode = errorCode;
        if(this.errorCode == 1){
            this.errorMessage = "Error: Login gagal! Email yang anda masukkan tidak valid.";
            System.out.println(errorMessage);
        }
        if(this.errorCode == 2){
            this.errorMessage = "Error: Login gagal! Email yang anda masukkan tidak terdaftar di google";
            System.out.println(errorMessage);
        }
    }

    public String getErrorMessage(){
        return errorMessage;
        }
    }

