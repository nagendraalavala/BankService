package com.example.customerAccount.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DebitEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long debitId;

    private long id;
    private long pin;

    public long getDebitId() {
        return debitId;
    }

    public void setDebitId(long debitId) {
        this.debitId = debitId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "DebitEntity{" +
                "debitId=" + debitId +
                ", id=" + id +
                ", pin=" + pin +
                '}';
    }
}
