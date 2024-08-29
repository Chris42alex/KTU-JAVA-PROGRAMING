import java.util.Scanner;
	class area {
		void circle(double radius) {
			double area;
			area=3.14*radius*radius;
			System.out.println("Area of Circle is"+area);
			}
		void rectangle(int length,int breadth) {
			int area;
			area=length*breadth;
			System.out.println("Area of Rectangle is"+area);
		    }
		void triangle(double height,double base) {
			double area;
			area=0.5*height*base;
			System.out.println("Area of Triangle is"+area);
		    } 
	}
	public class MethodOverloading{
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			area a=new area();
			System.out.println("Enter the radius of the circle :");
			double radius=sc.nextDouble();
			a.circle(radius); 
			System.out.println("Enter the length of the rectangle :");
			int length=sc.nextInt();
			System.out.println("Enter the breadth of the rectangle :");
			int breadth=sc.nextInt();
			a.rectangle(length,breadth);
			System.out.println("Enter the height of the triangle :");
			double h=sc.nextDouble();
			System.out.println("Enter the base of the triangle :");
			double b1=sc.nextDouble();
			a.triangle(h,b1);
			sc.close();
	}
	}