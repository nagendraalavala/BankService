package com.example.customerAccount.DTO;

public class CreditDTO
{
    private long creditId;
    private long creditZip;

    public long getCreditId() {
        return creditId;
    }

    public void setCreditId(long creditId) {
        this.creditId = creditId;
    }

    public long getCreditZip() {
        return creditZip;
    }

    public void setCreditZip(long creditZip) {
        this.creditZip = creditZip;
    }

    @Override
    public String toString() {
        return "CreditEntity{" +
                ", creditId=" + creditId +
                ", creditZip=" + creditZip +
                '}';
    }
}
