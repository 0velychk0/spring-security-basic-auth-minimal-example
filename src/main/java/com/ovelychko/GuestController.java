package com.ovelychko;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Objects;

@RestController
public class GuestController {

    @GetMapping("/user")
    public String getUserData(Principal principal) {
        return Objects.toString(principal);
    }

    @GetMapping("/free")
    public String securityNone(Principal principal) {
        return "securityNone";
    }

    @GetMapping("/logout-success")
    public String securityLogout(Principal principal) {
        return "logout-success";
    }

}
