package StringPrograms;

import java.util.Scanner;

public class A extends B {
	public void hai() {
	System.out.println("bye");
	Scanner s=new Scanner(System.in);
	String n = s.next();
	System.out.println(n);
	

	}
	public void bye() {
		System.out.println("hai");
	}
public static void main(String[] args) {
	B r=new A();
	r.bye();
	
	
}
}
