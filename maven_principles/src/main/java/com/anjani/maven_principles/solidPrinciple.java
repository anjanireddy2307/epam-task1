package com.anjani.maven_principles;

public class solidPrinciple {

}
public class Employee{
	public Money CalculatePay()...
	public String reportHours()...
	public void save()..
	}


//example for open/closed principle
public abstract class Shape
{
	public abstract double Area();
}
public class Rectangle extends Shape
{
	public double Width{get;set;};
	public double Heigth{get;set;};
	public override double Area()
	{
		return Width*Heigth;
	}
}
public class Circle extends Shape
{
	public double Radius{get;set;}
	public override double Area()
	{
		return Radius*Radius*Math.PI;
	}
}
public double Area(Shape[] shapes)
{
	double area=0;
	foreach(var shape in shapes)
	{
		area+=shape.Area();
	}
	return area;
}

//liskov substitution principle
public class Rectangle
{
	void setWidth(double w)
	void setHeigth(double h)
	double getHeight()
	double getWidth()
}
void test(Rectangle r)
{
	r.setWidth(5);
	r.setHeight(4);
	assertEquals(5*4,r.getWidth()*r.getHeight());
}

//interface segregation principle
            //public abstract class Animal{
	             //void feed();
                //}
                // class Dog extends Animal
                  //{
	             //void feed();//implementation
	              //void groom();//implementation
	
                     //}
                     //public classTiger extends Animal{
	                    //void feed();//implementation
                          //void groom();//dummy implementation
                        //modified the above code by applying interface segregation principle
  
public abstract class Animal{
	void feed();
}
public class Pet extends Animal
{
	void groom();
}
public class Dog extends Pet
{
	void feed();//implementation
	void groom();//implementation
	
}
public class classTiger extends Animal
{
	void feed();//implementation
}

//dependency inversion principle

      //enum OutputDevice{printer,disk}
       //void copy(OutputDevice dev)
        //{
         //int c;
         //while((c==ReadKeyboard())!=EOF)
          //{
           //if(dev==printer)
            //writePrinter(c);
            //else writeDisk(c);}}
           // modified the above code by applying dependency inversion principle 

interface Reader
{
char read();
}
interface Writer
{
	char write(char ch);
}
void copy(Reader r,Writer w)
{
	char ch;
	while((ch==r.read())!=EOF)
	{
		w.write(ch);
	}
}

