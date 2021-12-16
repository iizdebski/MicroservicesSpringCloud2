package com.izdebski.webservices.userservice;

import com.izdebski.webservices.model.request.UserDetailsRequestModel;
import com.izdebski.webservices.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
