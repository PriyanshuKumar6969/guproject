/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kryzle Rahne
 */
class User {
    private int patientID, age;
    private String name, phone, address, birthday, gender, date, illness, bloodType;
    
    public User(int patientID, int age, String phone, String name, String address, String birthday, String gender, String date, String illness, String bloodType)
    {
        this.patientID = patientID;
        this.age = age;
        this.phone = phone;
        this.name = name;
        this.address= address;
        this.birthday = birthday;
        this.gender = gender;
        this.date = date;
        this.illness = illness;
        this.bloodType = bloodType;
    }
    public int getpatientID(){
        return patientID;
    }
    public int getage(){
        return age;
    }
    public String getphone(){
        return phone;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getbirthday(){
        return birthday;
    }
    public String getgender(){
        return gender;
    }
    public String getdate(){
        return date;
    }
    public String getillness(){
        return illness;
    }
    public String getbloodType(){
        return bloodType;
    }
}
