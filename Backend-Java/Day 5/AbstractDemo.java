class Circle extends Shape{
	
	public Circle() {
		//super("Blue");
		System.out.println("Circle Created");
	}
	public Circle(String color) {
		// super();
		System.out.println("Circle created with Color");
	}
	public void draw() {
		super.draw();
		System.out.println("Drawing a Circle");
	}
	// Book b=new Book();
}
class Rectangle extends Shape{
	public Rectangle() {
		System.out.println("Rectangle Created");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Rectangle"); 
	}
	public int area(int length,int breadth) {
		return length*breadth;
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle=new Circle("Red");
		myCircle.draw();
	}

}
