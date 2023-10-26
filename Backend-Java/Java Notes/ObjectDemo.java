class Box{
	private int size;
	public Box() {
		size=0;
	}
	public Box(int size) {
		this.size=size;
	}
	public String toString() {
		return "Size of Box " + size;
	}
	public boolean equals(Box b) {
		if(this.size==b.size) return true;
		return false;
	}
	public int hashCode() {
		return size;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(5);
		Box b2=new Box(5);
		System.out.println("Box 1 " + b1.toString());
		System.out.println("Box 2 " + b2.toString());
		if(b1==b2) {
			System.out.println("== Equal");
		}
		else {
			System.out.println("== Not equal");
		}
		if(b1.equals(b2)) {
			System.out.println("equals|| Equal");
		}
		else {
			System.out.println("Equals || Not equal");
		}
	}

}
