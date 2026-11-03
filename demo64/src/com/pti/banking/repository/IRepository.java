package com.pti.banking.repository;

import java.util.List;

public interface IRepository<T> {

 String create(T t);
 String update(T newT);
 String delete(T t);
 List<T> findAll();
 T findOne(int id);
}
/*
 * create->create()
 * read->findAll(), findOne()
 * update->update()
 * delete->delete() 
 * <T> <>=>Generic 
 * T type->BankAccount, Person, Product,...
 *
 */
