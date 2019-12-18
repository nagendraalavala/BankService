package com.example.customerAccount.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerDetailsDAO {
    private long id;

    private String Name;
    private String Address1line;
    private String Address2line;
    private String city;
    private String state;
    private long zip;
    private long phone;
    private String email;
    private String Debit;
    private String Credit;

    public CustomerDetailsDAO(long id, String name, String address1line, String address2line, String city, String state, long zip, long phone, String email, String debit, String credit) {
        this.id = id;
        Name = name;
        Address1line = address1line;
        Address2line = address2line;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        Debit = debit;
        Credit = credit;
    }

    public CustomerDetailsDAO(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress1line() {
        return Address1line;
    }

    public void setAddress1line(String address1line) {
        Address1line = address1line;
    }

    public String getAddress2line() {
        return Address2line;
    }

    public void setAddress2line(String address2line) {
        Address2line = address2line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDebit() {
        return Debit;
    }

    public void setDebit(String debit) {
        Debit = debit;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String credit) {
        Credit = credit;
    }
}