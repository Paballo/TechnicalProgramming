/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.Services;

import java.util.List;

/**
 *
 * @author donkey
 * @param <S>
 * @param <ID>
 */
public interface CrudService<S, ID> {

    public S find(ID id);

    public S persist(S entity);

    public S merge(S entity);

    public S remove(S entity);

    public List<S> findAll();
}

