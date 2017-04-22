package service;


import dao.CustomerDAO;
import domain.Customer;

public class CustomerService {

    private CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public String getCustomersFullName() {
        Customer customer = customerDAO.getCustmerInfo();
        return customer.getFirstName()+" "+ customer.getLastName();


    }

}
