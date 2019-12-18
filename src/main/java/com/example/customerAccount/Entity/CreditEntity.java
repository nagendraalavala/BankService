package com.example.customerAccount.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long creditId;
    private long creditZip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
                "id=" + id +
                ", creditId=" + creditId +
                ", creditZip=" + creditZip +
                '}';
    }
}
