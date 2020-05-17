package shell.we.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shell.we.shop.dao.Customer;
import shell.we.shop.mapper.CustomerMapper;
import shell.we.shop.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override public boolean createUser() {
        return false;
    }

    @Override public List<Customer> getCustomerList() {
        return customerMapper.getCustomerList();
    }
}
