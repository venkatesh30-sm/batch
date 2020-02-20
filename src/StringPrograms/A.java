package StringPrograms;

public class A extends B {
	public void hai() {
	System.out.println("bye");
	System.out.println("adding 1st line");
	System.out.println("task completed");

	}
	public void bye() {
		System.out.println("hai");
	}
public static void main(String[] args) {
	B r=new A();
	r.bye();
	
	
}
}
