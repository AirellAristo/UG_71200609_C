package com.ug11.instapost;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){
    }

    public void printInfo(){
        System.out.println("Username :" + this.username.toUpperCase());
        System.out.println("Email :" + this.email);
        System.out.println("Total Mention :" + this.totalMention);
    }

    public void login(String email){
        try{
            if(email.contains("@")){
                if(email.contains("gmail.com")){
                    this.email = email;
                    System.out.println("Login Berhail");
                    String a = email.substring(0,email.length()-10);
                    this.username = a.toLowerCase();
                }else
                    throw new EmailException(2);
            }
            else{
                throw new EmailException(1);
            }
        }
        catch (EmailException e) {

        }}

    public void post(String a){
        List aList = new ArrayList();
        if(a.contains("@")){
            char check;
            String[] simpan = a.split(" ");
            for(int x=0 ; x<simpan.length ; x++) {
                if (simpan[x].contains("@")) {
                    aList.add(simpan[x]);
                }
            }
            for(int i=0; i<a.length() ; i++){
                check = a.charAt(i);
                if(check == '@'){
                    this.totalMention++;
                }
            }

        }else{
            this.totalMention = 0;
        }
        System.out.println("Caption: " + a);
        if (totalMention == 0 ){
            System.out.println("Pengguna yang anda mention: - ");}
        else{
            if(aList.size() == 1){
                System.out.println("Pengguna yang anda mention: " + aList.get(0));
            }else{
                for(int c=0 ; c < aList.size() ; c++  ){
                    String x = "";
                    String z = x.concat(String.valueOf(aList.get(c))+",");
                    if (c+1 == aList.size()-1){
                        x.concat(String.valueOf(aList.get(c)));
                        break;}
                    System.out.println("Pengguna yang anda mention: "+ z);
                }

                }
            }
        System.out.println("Total username:" + this.totalMention);

    }
}
