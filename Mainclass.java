//WAP to show the use of interface

interface Run
{
	static final int x1=50;
	public void test();
} 

class Demo implements Run
{
	public void test()
	{
		System.out.println("overriding test()");
	}

}

class Mainclass
{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		Demo ref=new Demo();
		ref.test();
		System.out.println(Run.x1);

		System.out.println("Program ends");
	}
}
