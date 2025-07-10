package com.example.Springbootfirstproject.Models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;


public class UserPrincipal implements UserDetails {


    private RegisterDetails registerDetails;

    public UserPrincipal(RegisterDetails registerDetails) {
        this.registerDetails = registerDetails;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String role = "ROLE_" + registerDetails.getRole();
        System.out.println(role);
        return Collections.singleton(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getPassword() {
        return registerDetails.getPassword();
    }

    @Override
    public String getUsername() {
        return registerDetails.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
