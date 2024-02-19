package com.rehan.ch9ex3.model;

import com.rehan.ch9ex3.service.LoggedUserManagementService;
import com.rehan.ch9ex3.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username;
    private String password;
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService,LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login() {
        loginCountService.increment();
    String password = this.getPassword();
    String username = this.getUsername();

    if(username.equals("rehan") && password.equals("password")) {
        loggedUserManagementService.setUsername(username);
        return true;
    } else {
        return false;
    }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
