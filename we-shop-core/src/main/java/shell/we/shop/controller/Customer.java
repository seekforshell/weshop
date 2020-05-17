package shell.we.shop.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    @PostMapping("/user")
    public boolean createUser() {
        return false;
    }
}
