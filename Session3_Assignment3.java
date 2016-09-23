//Write a program to calculate area of rectangle and triangle using single inheritance.

package aatika;
import java.awt.geom.Area;
import java.util.*;

class Rectangle
	{
		int l,b;
		Rectangle(int x,int y)
		{	
		l=x;
		b=y;
		}
		int getRectangle()
		{
			
			return l*b;
		}
		
		
	}

class Triangle extends Rectangle

{
	float a;
	Triangle(int u, int v)
	{
		super(u,v);
		
	}
	float getTriangle()
	{
		a = (float)1/2*l*b;
		return(a);
	}
}
	public class Session3_Assignment3 
	{
		public static void main(String args[])
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the parameter");
			int p = sc.nextInt();
			int q = sc.nextInt();
			Triangle ar = new Triangle(p,q);
			System.out.println("Area of Rectangle is : "+ar.getRectangle());
			System.out.println("Area of Triangle is : "+ar.getTriangle());
		}
	}
