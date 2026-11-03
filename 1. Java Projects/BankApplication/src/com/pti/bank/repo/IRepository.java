package com.pti.bank.repo;


	import java.util.List;
	import com.pti.bank.model.BankAccount;

	public interface IRepository {

	    void save(BankAccount account);

	    BankAccount findOne(int accountNumber);

	    List<BankAccount> findAll();

	    void delete(int accountNumber);

}
