package com.felipe.stefanini;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "word";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String hello2() {
        return "word-admin";
    }
}
