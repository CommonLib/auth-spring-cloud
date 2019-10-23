/*
 * Licensed Materials - Property of PwC
 * (c) Copyright Pwc Corp. 2019. All Rights Reserved.
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with PwC Corp.
 */

package spring.cloud.auth.user.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import spring.cloud.auth.user.domain.Role;
import spring.cloud.auth.user.domain.User;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by byang059 on 2019-10-22
 */
@Service
public class UserService implements UserDetailsService {
    public static final Map<String, UserDetails> userStore = Maps.newHashMap();

    @PostConstruct
    public void init() {
        userStore.put("user", new User("user", Lists.newArrayList(new Role("user"))));
        userStore.put("admin", new User("admin", Lists.newArrayList(new Role("admin"), new Role("user"))));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userStore.get(username);
    }
}
