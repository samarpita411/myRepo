//WAP to show interface using mobilephone interface & camera interface and smartphone class

interface MobilePhone
{
	public void call();
	public void sms();
} 

interface Camera
{
	public void takeSelfie();
}

class Smartphone implements Camera,MobilePhone
{
	public void call()
	{
	System.out.println("calling..");
	}

	public void sms()
	{
	System.out.println("sending..");

	}
    public void takeSelfie()
	{
	System.out.println("taking pic..");
	`
	}

}

class Mainclass2
{

   public static void main(String[] args) 
	{
		System.out.println("Program starts");
        Smartphone sp1=new Smartphone();
		sp1.call();
		sp1.sms();
		sp1.takeSelfie();

		System.out.println("Program ends");
	}
}
