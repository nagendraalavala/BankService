package com.example.customerAccount.DTO;

public class DebitDTO
{
    private long id;
    private long pin;

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
                ", id=" + id +
                ", pin=" + pin +
                '}';
    }
}
