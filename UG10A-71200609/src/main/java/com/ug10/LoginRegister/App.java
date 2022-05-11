package com.ug10.LoginRegister;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main( String[] args ) throws PasswordException, EmailException {
        ArrayList<String> data = new ArrayList<String>();
        boolean cekUser = false;
        boolean cekEmail = false;
        boolean cekPass = false;
        int loop = 0;
        System.out.println( "Selamat Datang di Toko NamaKamu" );
        System.out.println( "Silahkan daftarkan diri kamu untuk dapat mengakses menu di Toko NamaKamu");

        while (loop == 0){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Username : ");
            String username = myObj.nextLine();
            try{
                if (username.length() < 6){
                    throw new UsernameException();
                }else{
                    data.add(username);
                    loop += 1;
                    cekUser = true;
                }
            }
            catch (UsernameException e) {}
            }

        while (loop == 1){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Email : ");
            String email = myObj.nextLine();
            String kecil = email.toLowerCase();
            try{
                if(!(kecil.contains("@") && kecil.contains(".com"))){
                    throw new EmailException();
                }else{
                    data.add(email);
                    loop += 1;
                    cekEmail = true;
                }
            }
            catch (EmailException e) {}
        }

        while (loop == 2){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Password : ");
            String password = myObj.nextLine();
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(password);
            boolean isStringContainsSpecialCharacter = matcher.find();
            try{
                if (password.length() < 7){
                    throw new PasswordException(1);
                }
                else if(password == data.get(0)){
                    throw new PasswordException(2);}
                else if(isStringContainsSpecialCharacter){
                    for(int i = 0 ; i != password.length(); i++){
                        char c = password.charAt(i);
                        if (Character.isLetter(c) || Character.isDigit(c)){
                            data.add(password);
                            loop += 1;
                            cekPass = true;
                        }
                        else{
                            throw new PasswordException(3);
                        }}}
                else if(isStringContainsSpecialCharacter == false){
                            throw new PasswordException(3);
                        }
            } catch (PasswordException e) {}

        }

        if(cekUser == true && cekEmail == true && cekPass == true){
            User user = new User(data.get(0),data.get(1),data.get(2));
            System.out.println("Akun kamu berhasil didaftarkan!");
            System.out.println("Silahkan login untuk melanjutkan.");
            boolean login = true;
            while (login){
                Scanner myUser = new Scanner(System.in);
                System.out.println("Username : ");
                String username = myUser.nextLine();
                Scanner myPass = new Scanner(System.in);
                System.out.println("Password : ");
                String password = myPass.nextLine();
                try {
                    if (username != data.get(0) || password != data.get(2)){
                        throw new LoginException();
                    }
                    else{
                        System.out.println("Selamat Datang " + data.get(0));
                    }
                }catch (LoginException e) {}
                }

            }

    }

}

