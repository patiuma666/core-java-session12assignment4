package assignment12;

import java.util.Scanner;
                            //here I'm creating a class BankAtm
public class BankAtm {
	int atmId;
	String bankName; //taking variables of BankAtm details
	String location;
	double balance;
	double amount;
	public void  BankAtm(){     //crating a default constructor
		atmId = 1;
		bankName = "0";
		location = "0";
		balance = 1000;
		amount =0;			
		}
	BankAtm(double bal,int num,String abc,String xyz,double amt){
		balance =bal; //here I'm taking a parameterized constructor
		atmId = num;
	}
	 public void deposit(double amount){            //    here creating a method of deposit
		 balance = balance+amount;
		 System.out.println("money deposited succesfully: " +balance); //and depositing the amount
		 
	 }
	 public void withdraw(double amount) throws InsufficientBalanceException{
		                  //here creating the method withdraw amount which throws an exception if the balance is less than 10000
		
		 if(balance-amount <1000){
			 throw new InsufficientBalanceException("withdrawal failure is you have insufficient balance.your balance is Rs. "+amount);
		 }      //which handles the exception
	 
	 else {
		 balance = balance-amount;      //it shows  the available balance after withdrawn the amount
		 System.out.println("money withdrawn::availabe balance Rs."+balance);
		 
	 }
	 
}
	
	}

		
	


