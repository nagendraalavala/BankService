package com.example.customerAccount.DAO;

public class DebitDAO
{
    private long id;
    private long debitId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDebitId() {
        return debitId;
    }

    public void setDebitId(long debitId) {
        this.debitId = debitId;
    }

    @Override
    public String toString() {
        return "DebitDAO{" +
                "id=" + id +
                ", debitId=" + debitId +
                '}';
    }
}
