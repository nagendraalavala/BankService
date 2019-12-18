package com.example.customerAccount.Service;

import com.example.customerAccount.DAO.CustomerDAO;
import com.example.customerAccount.Entity.CustomerEntity;
import com.example.customerAccount.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankService {

    private CustomerRepository customerRepository;
    private CustomerDAO customerDAO;

    public BankService(CustomerRepository customerRepository, CustomerDAO customerDAO) {
        this.customerRepository = customerRepository;
        this.customerDAO = customerDAO;
    }

    public CustomerDAO saveCustomer(CustomerEntity customer)
    {
        customerRepository.save(customer);
        Optional<CustomerEntity> customerPresent=customerRepository.findById(customer.getId());
        if(customerPresent.isPresent()){
            CustomerEntity newCustomer;
            newCustomer=customerPresent.get();
            customerDAO.setId(newCustomer.getId());
            customerDAO.setStatus("Success");
            return  customerDAO;
        }
        else
        {
            throw new RuntimeException("Error in Saving Customer . Please try again");
        }

    }
}
