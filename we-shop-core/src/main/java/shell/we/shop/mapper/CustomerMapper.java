package shell.we.shop.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import shell.we.shop.dao.Customer;

@Mapper
public interface CustomerMapper {
    List<Customer> getCustomerList();
}
