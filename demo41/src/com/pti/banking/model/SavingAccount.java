package com.pti.banking.model;

public class SavingAccount  extends BankAccount{
	
	private final double MINIMUM_BALANCE=10000;
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accName, double balance) {
		super(accName, balance);
		// TODO Auto-generated constructor stub
	}
    @Override
    public double withdraw(double amount) {
    	double difference=this.getBalance()-amount;
    	if(difference>=MINIMUM_BALANCE) {
    		this.setBalance(difference);
    		}else {
    			System.out.println("Insufficient Balance");
    		}
    	return this.getBalance();
    }
	//MB=10000 BALANCE=50000 AMOUNT =10000
    //50000-10000=40000>=10000->TRUE-.SETBALANCE(40000)
    //50000-50000=0>=10000->FALSE->SETBALANCE(40000)
    // //50000-49000=10000>=10000->FALSE->SETBALANCE(40000)

}
