/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Tang Thanh Vui - CE180901
 */
public class Guest {

    /*
    [GuestID] INT PRIMARY KEY,
    [RoleID] INT,
    [FullName] NVARCHAR(100),
    [DOB] DATE,
    [Gender] NVARCHAR(15),
    [PhoneNo] NVARCHAR(15),
    [Email] NVARCHAR(100) UNIQUE,
    [Password] NVARCHAR(255),
    [Address] NVARCHAR(255),
    [City] NVARCHAR(50),
    [Country] NVARCHAR(255),
    FOREIGN KEY ([RoleID]) REFERENCES [Role]([RoleID])
     */
    private int GuestID;
    private int RoleID;
    private String FullName;
    private Date DOB;
    private String Gender;
    private String PhoneNo;
    private String Email;
    private String Password;
    private String Address;
    private String City;
    private String Country;

    public Guest() {
    }

    public Guest(int GuestID, int RoleID, String FullName, Date DOB, String Gender, String PhoneNo, String Email, String Password, String Address, String City, String Country) {
        this.GuestID = GuestID;
        this.RoleID = RoleID;
        this.FullName = FullName;
        this.DOB = DOB;
        this.Gender = Gender;
        this.PhoneNo = PhoneNo;
        this.Email = Email;
        this.Password = Password;
        this.Address = Address;
        this.City = City;
        this.Country = Country;
    }

    public int getGuestID() {
        return GuestID;
    }

    public void setGuestID(int GuestID) {
        this.GuestID = GuestID;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    
}
