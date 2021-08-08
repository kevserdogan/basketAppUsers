package com.basketapp.basketuser.basketappuser.controller;

import com.basketapp.basketuser.basketappuser.entity.User;
import com.basketapp.basketuser.basketappuser.orchestration.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

public  UserController(UserService userService)
{
    this.userService=userService;
}

    @GetMapping
    public Iterable<User> getAllUsers()
    {
        return  userService.getAllUsers();
    }
    @GetMapping("/{email}")
    public User getProductById(@PathVariable String email)
    {

        Optional<User> product= userService.getUserByEmail(email);
        if(product.isPresent()) {

            return  product.get();
        }
        return new User();
    }
    @PostMapping
    public void  saveProduct(@RequestBody User user)
    {
        userService.saveUser(user);
    }
    @PutMapping("/{email}")
    public void updateProduct(@PathVariable  String email)
    { //TODO buraya product entity setlenecek.
        userService.updateUser(email);
    }
    @DeleteMapping("/{email}")
    public void removeProductBySerialNumber(@PathVariable String email)
    {
        userService.deleteProductBySerialNumber(email);
    }
}
