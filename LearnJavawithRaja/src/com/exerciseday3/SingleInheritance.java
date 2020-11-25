package com.exerciseday3;

public class SingleInheritance extends A {

	public static void main(String[] args) {

		SingleInheritance si = new SingleInheritance();
		si.methodOne();
		
	}

}

class A {
	
	public void methodOne() {
		System.out.println("This is A's method !!");
	}
}