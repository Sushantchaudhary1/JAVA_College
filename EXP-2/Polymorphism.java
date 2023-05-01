package Unit2;

class shape{
	void draw() {
		System.out.println("Shape is draw");
	}
	void erase() {
		System.out.println("Shape is erase");
	}
}

class circle extends shape{
	void draw() {
		System.out.println("Shape is draw");
	}
	void erase() {
		System.out.println("Shape is erase");
	}
	
}

class Triangle extends circle{
	void draw() {
		System.out.println("Shape is draw");
	}
	void erase() {
		System.out.println("Shape is erase");
	}
	
}

class square extends Triangle{
	void draw() {
		System.out.println("Shape is draw");
	}
	void erase() {
		System.out.println("Shape is erase");
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    shape obj=new shape();
       obj.draw();
       obj.erase();
	}

}
