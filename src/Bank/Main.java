package Bank;

import java.util.Optional;

class Bank {
	public int account_number;
	private String name;
	private int balance;
	
	
	public Bank(int account_number,String name,int balance)
	{
		this.account_number=account_number;
		this.name=name;
		this.balance=balance;
		
	}
	
	void check_balance(int account_number)
	{
		if(account_number!=0)
		{
		  System.out.println(this.name);
		  System.out.println(this.balance);
		  
		}
	}
	void withdraw(int accountnumber)
	{
		if(accountnumber!=0)
		{
			if(balance<=0){
				System.out.println("no transaction possible with "+balance+" balance");
			}
			else {
				System.out.println((this.balance)-100);
			}
			
		}
		
	}

	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}


public class Main {

	public static void main(String[] args) {
		Bank b1=new Bank(78655678,"kumar",0);
		Bank b2=new Bank(78655699,"kumari",100);
		Bank b3=new Bank(78655690,"kumaran",900);
		Bank b4=new Bank(78655679,"kumaroy",1000);
		
		b1.withdraw(78655678);
		b2.withdraw(78655699);
		b3.withdraw(78655690);
		b4.withdraw(78655679);
		b2.check_balance(78655699);
	
		
	}

	
	}

	

	


