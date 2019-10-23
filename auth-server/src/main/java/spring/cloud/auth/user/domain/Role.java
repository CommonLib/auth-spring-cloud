/*
 * Licensed Materials - Property of PwC
 * (c) Copyright Pwc Corp. 2019. All Rights Reserved.
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with PwC Corp.
 */

package spring.cloud.auth.user.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by byang059 on 2019-10-22
 */
public class Role implements GrantedAuthority {

    private final String name;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
