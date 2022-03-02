package com.ug4.soal1;

public class Driver {
    private String name;
    private Integer age;
    private  String gender;

    //public Driver(String namaDriver){
    //    name = namaDriver;
    //}
    public String getName(){
        return name;
    }

    public void setName(String namaDriver){
        name = namaDriver;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer buatAge){
        age = buatAge;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String buatGender){
        gender=buatGender;
    }
}
