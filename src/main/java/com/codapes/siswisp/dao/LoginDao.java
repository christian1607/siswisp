
package com.codapes.siswisp.dao;

import com.codapes.siswisp.entity.Users;



/**
 *
 * @author Christian
 */
public interface LoginDao {
    
    public Users login(String username);
}
