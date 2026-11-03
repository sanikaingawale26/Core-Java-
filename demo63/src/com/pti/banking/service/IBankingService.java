/**
 * 
 */
package com.pti.banking.service;

import java.util.List;

/**
 * @author Avidhanu
 *
 */
public interface IBankingService<T> {
 String create(T t);

 String update(T newT);

 String delete(T t);

 List<T> findAll();

 T findOne(int id);
}
