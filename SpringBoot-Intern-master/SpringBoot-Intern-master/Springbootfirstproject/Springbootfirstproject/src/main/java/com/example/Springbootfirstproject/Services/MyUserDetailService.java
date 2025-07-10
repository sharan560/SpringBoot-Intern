package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.RegisterDetails;
import com.example.Springbootfirstproject.Models.UserPrincipal;
import com.example.Springbootfirstproject.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        RegisterDetails registerDetails = userRepo.findByEmail(username);
        if (registerDetails == null) {
            System.out.println("Username not found");
            throw new UsernameNotFoundException(username);

        }

        return new UserPrincipal(registerDetails);


    }
}
