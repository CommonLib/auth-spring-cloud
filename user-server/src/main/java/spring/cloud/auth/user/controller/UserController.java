/*
 * Licensed Materials - Property of PwC
 * (c) Copyright Pwc Corp. 2019. All Rights Reserved.
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with PwC Corp.
 */

package spring.cloud.auth.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by byang059 on 2019-10-22
 */
@RestController
public class UserController {
    @GetMapping("/test")
    @PreAuthorize("hasAuthority('admin')")
    public String getUser(){
        return "OK";
    }
}
