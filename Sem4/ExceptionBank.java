class NotEnoughMoneyException extends Exception  
{  
    public NotEnoughMoneyException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
class ExceptionBank {
	int total = 0;
	void deposit(int amount) {
		System.out.println("Old balance: " + total);
		total += amount;
		System.out.println("New balance: " + total);
	}
	void withdraw(int amount) {
		try{
			if(amount > total) {
				throw new ArithmeticException("Not enough balance");
			}
			if((total-amount)<500){
				throw new NotEnoughMoneyException("Balance less than $500");
			}
		}
		catch (NotEnoughMoneyException ude)  
        	{  
          		System.out.println("Caught the exception");  
          		// Print the message from MyException object  
            		System.out.println(ude.getMessage());  
       		 }    
		System.out.println("Old amount: " + total);
		total-=amount;
		System.out.println("New amount: "+total);		
	}
	public static void main(String args[]){
		Bank b = new Bank();
		b.deposit(500);
		b.withdraw(600);
	}
}


