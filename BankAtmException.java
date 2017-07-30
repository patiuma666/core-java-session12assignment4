package assignment12;

public class BankAtmException {     //creating a class BankAtmException
	public static void main(String[]args){  //creating main method
		 BankAtm uma = new BankAtm (20000,1,"uma","hyd",10000);   //creating objects which shows the details
		 BankAtm shanti = new BankAtm (10000,2,"shanti","hyd",20000);
		 BankAtm satya = new BankAtm (1000,3,"satya","hyd",1000);
		  
		 uma.deposit(1000);//her I'm depositing the amount
		 try
		 {
			 uma.withdraw(1000);          //here the withdrawal throws an Exception with try catch showing the withdrawn amount 
			 shanti.withdraw(2000);
			 satya.withdraw(500);
		 }
		 catch (InsufficientBalanceException e){     //here it catch the exception which occurs in the output and shows insufficient balance
			 System.out.println("insufficient balance:");
		 }
	}

}
