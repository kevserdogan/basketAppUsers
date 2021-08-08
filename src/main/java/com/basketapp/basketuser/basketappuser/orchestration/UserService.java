package com.basketapp.basketuser.basketappuser.orchestration;

import com.basketapp.basketuser.basketappuser.entity.User;
import com.basketapp.basketuser.basketappuser.reposityory.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    public Iterable<User> getAllUsers()
    {
        return  userRepository.findAll();
    }
    public void saveUser(User product)
    {
        userRepository.save(product);
    }
    public Optional<User> getUserByEmail(String email)
    {
        return userRepository.findById(email);
    }

    public void updateUser(String email)
    {
        Optional<User> user = getUserByEmail(email);
        if(user.isPresent())
        {
            userRepository.save(user.get());
        }
    }
    public void deleteProductBySerialNumber(String serialNumber)
    {
        Optional<User> user = getUserByEmail(serialNumber);
        if(user.isPresent())
        {
            userRepository.save(user.get());
        }
    }
}
