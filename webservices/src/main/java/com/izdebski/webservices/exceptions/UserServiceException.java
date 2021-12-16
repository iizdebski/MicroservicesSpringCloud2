package com.izdebski.webservices.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = -5624994920615957532L;

    public UserServiceException(String message) {
        super(message);
    }
}