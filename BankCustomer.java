interface Account
{
	public void deposit();
	public void withdraw();

} 

class Savings implements Account
{
    public void deposit()
	{
     System.out.println("depositing money in savings");
    }
    public void withdraw()
	{
	System.out.println("withdrawing money from savings");
	}
}

class Loan implements Account
{
public void deposit()
	{
     System.out.println("depositing money in Loan");
    }
    public void withdraw()
	{
	System.out.println("withdrawing money from Loan");
	}
}

class AcntMngr
{
	public Account createAccount(char type)
	{
	Account ref;
	if(type=='S')
		{
	     ref=new Savings();
		 return ref;
	    }

	else
		{
	    ref=new Loan();
		 return ref;
	    }
	}//end of createAccount method
}

class BankCustomer
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		AcntMngr mgr=new AcntMngr();
		Account a1=mgr.createAccount('L');
		a1.deposit();
		a1.withdraw();

		System.out.println("Program ends");
	}
}
