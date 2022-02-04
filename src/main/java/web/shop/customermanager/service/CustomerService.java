package web.shop.customermanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.shop.customermanager.exception.UserNotFoundException;
import web.shop.customermanager.model.Customer;
import web.shop.customermanager.repo.CustomerRepo;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer) {
        customer.setCustomerId(UUID.randomUUID().toString());
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepo.findCustomerById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " +id + "was not found"));
    }

    public void deleteCustomer(Long id) {
        customerRepo.deleteCustomerById(id);
    }

}
