
package com.codapes.siswisp.dao;

import java.util.List;

/**
 *
 * @author Christian
 */
public interface EntityDao{

    public <T> void createT(T t);
    public <T> List<T> listT(Class t);
    public <T> void updateT(T t);
    public <T> void deleteT(T t, int id);
    public <T> T findById(Class t,int i);
}
