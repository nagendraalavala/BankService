package com.example.customerAccount.DAO;

public class CustomerDAO
{
    private long id;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CustomerDAO{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
