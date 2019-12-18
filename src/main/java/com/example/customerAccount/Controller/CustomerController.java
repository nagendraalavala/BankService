package com.example.customerAccount.Controller;

import com.example.customerAccount.DAO.CustomerDAO;
import com.example.customerAccount.Entity.CustomerEntity;
import com.example.customerAccount.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerDAO customerDAO;
    BankService bankService;

    @RequestMapping("/registration")
    CustomerDAO registration(CustomerEntity customer){
        return  bankService.saveCustomer(customer);
    }
}
