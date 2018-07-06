package com.codapes.siswisp.service.impl;

import com.codapes.siswisp.dao.LoginDao;
import com.codapes.siswisp.entity.Admin;
import com.codapes.siswisp.entity.Users;
import com.codapes.siswisp.service.LoginService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */
@Service
public class LoginServiceImpl implements UserDetailsService {

    @Autowired
    private LoginDao userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users userInfo = userDAO.login(username);
        GrantedAuthority authority = new SimpleGrantedAuthority(userInfo.getRoles().get(0).getRole());
       
        UserDetails userDetails = (UserDetails) new User(userInfo.getUsername(),
                                                userInfo.getPassword(),
                                                Arrays.asList(authority));
        return userDetails;
    }

}
