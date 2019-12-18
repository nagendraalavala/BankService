package com.example.customerAccount.DTO;

public class CustomerDTO
{
    private String Name;
    private String Address1line;
    private String Address2line;
    private String city;
    private String state;
    private long zip;
    private long phone;
    private String email;

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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "Name='" + Name + '\'' +
                ", Address1line='" + Address1line + '\'' +
                ", Address2line='" + Address2line + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
