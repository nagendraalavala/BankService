package com.example.customerAccount.DAO;

public class CreditDAO
{
    private long id;
    private long creditId;

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

    @Override
    public String toString() {
        return "CreditDAO{" +
                "id=" + id +
                ", creditId=" + creditId +
                '}';
    }
}
