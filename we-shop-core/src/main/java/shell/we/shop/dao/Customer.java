package shell.we.shop.dao;

import lombok.Data;

@Data
public class Customer {
    private Integer id;
    private String name;
    private String email;
    private Integer sex;
    private String role;
    private String pwd;
}
