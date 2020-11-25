package com.exerciseday3;

public class MultilevelInheritance extends Second {
	
	public void methodThird() {
		System.out.println("This call is from Third class");
	}

	public static void main(String[] args) {
		
		MultilevelInheritance ml = new MultilevelInheritance();
		
		ml.methodFirst();
		ml.methodSecond();
		ml.methodThird();

	}

}

class First{
	
	public void methodFirst() {
		
		System.out.println("This call is from First class");
	}
}

class Second extends First{
	
	public void methodSecond() {
		System.out.println("This call is from Second class");
	}
}