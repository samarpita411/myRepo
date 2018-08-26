//WAP to draw shape by using abstraction using Shape interface

interface Shape
{
	public void draw();
} 

class Circle implements Shape
{
	public void draw()
	{
	System.out.println("draw a circle");
	}
}

class Rectangle implements Shape
{
	public void draw()
	{
System.out.println("draw a circle");
	}
}

class GenerateShape 
{
	public Shape getShape(char type)
	{
	Shape ref;
	if(type=='C')
		{
	     ref= new Circle();
		 return ref;
	
	    }
	else
		{
		ref= new Rectangle();
		return ref;
	
		}
	
	}

}


class Paint
{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");

        GenerateShape g1=new GenerateShape();
		Shape s1=g1.getShape('C');
		s1.draw();

		System.out.println("Program ends");
	}
}
