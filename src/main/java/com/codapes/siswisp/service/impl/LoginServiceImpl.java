
package com.codapes.siswisp.service.impl;

import com.codapes.siswisp.dao.LoginDao;
import com.codapes.siswisp.entity.Admin;
import com.codapes.siswisp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginDao loginDao;
    
    
    @Override
    public Admin login(Admin c) {
       return loginDao.login(c);
        
    }
    
}
