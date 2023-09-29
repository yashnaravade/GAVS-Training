
public abstract class Shape {
	public Shape() {
		System.out.println("Shape created");
	}
	public Shape(String color) {
		this.color=color;
		System.out.println("Shape with Color created");
	}
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public abstract void draw();
}
