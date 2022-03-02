package com.ug4.soal1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Bus {
    private String name;
    private Driver driver;
    private Integer CAPACITY;
    private ArrayList<Passanger> passanger;
    private int usedCapacity;
    private double fares;
    private double profit;
    private String route;

    Driver akang =  new Driver();
    Passanger penumpang = new Passanger()
    public String getName (){
        return name;
    }

    public void setName(String namaBus){
        name = namaBus;
    }

    public String getDriver(){
        return akang.getName();
    }

    public void setDriver(){
        akang.setName("Ujang");
    }

    public int getCapacity(){
        return CAPACITY;
    }

    public ArrayList<Passanger> getPassanger() {
        return passanger;
    }

    private void setUsedCapacity(int setCapacity){
        CAPACITY = CAPACITY - setCapacity;
    }

    public double getFares(){
        return fares;
    }

    public double getProfit(){
        return profit;
    }

    private void setProfit(double mantaProfit){
        profit = profit + mantaProfit
    }

    public boolean checkPassangerBalance(){

    }

    public void (double saldo){
        penumpang.setBalance(saldo);
    }

    private void takePassanger(Passanger){

    }

    public void dropPassanger(Passanger){

    }

    public void proceedOrder(String namaPenumpang,Passanger){

    }

    public String cancelOrder(Passanger){

    }
}
