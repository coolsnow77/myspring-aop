package com.xueguoxue.myaop.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @RequestMapping("/index")
    public String index()
    {
        return "index page..";
    }

    @RequestMapping("/common")
    public String common()
    {
        return "only login can access";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String admin()
    {
        return "only admin can access this page..";
    }
}
