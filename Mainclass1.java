//WAP to show when to implement and when to extend
interface Run1
{
	public void count();
}
interface Run2 extends Run1
{
	public void view();
}

class Sample implements Run2
{
	public void view()
	{
	 System.out.println("overriding view() in sample");
	}

	public void count()
	{
     System.out.println("overriding count() in Sample");
	}
}

class Mainclass1
{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
        Sample s1=new Sample();
		s1.count();
		s1.view();

		System.out.println("Program ends");
	}
}
