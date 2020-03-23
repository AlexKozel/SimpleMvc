package com.simpleweb;

public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("alex")
                && password.equalsIgnoreCase("password");
    }
}
