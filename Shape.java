abstract class Figure{
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}
class Circle extends Figure{
	float r;
	double pi=3.14;
	void findArea()
	{
		//taking circle of radius in runtime
		System.out.print("Enter radius of circle:");
		r=Float.parseFloat(System.console().readLine());
		dim1=pi*r*r;		//Calculating area of Circle using abstract variable
		System.out.println("Area of the Circle is " +dim1);
	}
	void findPerimeter()
	{	
		dim1=2*pi*r;		//Calculating perimeter of Circle using abstract variable
		System.out.println("Perimeter of the Circle is " +dim1);
	}
}
	
class Rectangle extends Figure{
	float l,w;
	void findArea()
	{
		//taking length and width of rectangle in runtime
		System.out.print("Enter length of rectangle:");
		l=Float.parseFloat(System.console().readLine());
		System.out.print("Enter width of rectangle:");
		w=Float.parseFloat(System.console().readLine());
		dim1=l*w;		//Calculating area of rectangle using abstract variable
		System.out.println("Area of the rectangle is " +dim1);
	}
	void findPerimeter()
	{
		dim1=2*((float)l*w);	//Calculating perimeter of rectangle using abstract variable
		System.out.println("Perimeter of the rectangle is " +dim1);
	}
}
class Triangle extends Figure{
	float a,b,c,h;
	void findArea()
	{
		//taking sides and heght of triangle in runtime
		System.out.print("Enter a value of triangle:");
		a=Float.parseFloat(System.console().readLine());
		System.out.print("Enter base value of triangle:");
		b=Float.parseFloat(System.console().readLine());
		System.out.print("Enter c value of triangle:");
		c=Float.parseFloat(System.console().readLine());
		System.out.print("Enter height of triangle:");
		h=Float.parseFloat(System.console().readLine());
		dim1=(float)a+b+c;		//Calculating Area of triangle using abstract variable
		System.out.println("Area of triangle: "+dim1);
	}
	void findPerimeter()
	{
		dim1=h*b/2;		//Calculating perimeter of triangle using abstract variable
		System.out.println("Perimeter of triangle: "+dim1);	
	}
}
class Shape{
	public static void main(String args[])
	{
		//Creating object using abstract class
		Figure cir=new Circle();	
		cir.findArea();
		cir.findPerimeter();
		Figure rec=new Rectangle();
		rec.findArea();
		rec.findPerimeter();
		Figure tri=new Triangle();
		tri.findArea();
		tri.findPerimeter();
	}
}
	