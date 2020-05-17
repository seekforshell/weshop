package shell.we.shop.service;

import java.util.List;
import shell.we.shop.dao.Customer;

public interface CustomerService {
    boolean createUser();
    List<Customer> getCustomerList();
}
