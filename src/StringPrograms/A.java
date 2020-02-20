package StringPrograms;

import java.util.Scanner;

public class A extends B {
	public void hai() {
	System.out.println("bye");


	System.out.println("adding 1st line");
	System.out.println("task completed");
	
	Scanner s=new Scanner(System.in);
	String n = s.next();
	System.out.println(n);
	



	}
	public void bye() {
		System.out.println("hai");
		System.out.println("java codes");
		System.out.println("completed my work");
	}
public static void main(String[] args) {
	B r=new A();
	r.bye();
	
	
}
}
