package com.photoapp.users.service;

import com.photoapp.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
    UserDto getUserDetailsByEmail(String email);
    UserDto getUserByUserId(String userId);
}