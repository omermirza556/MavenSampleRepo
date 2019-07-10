package com.first;

public class MathOpperation {
	public int add(int a , int b) {
		return a + b;
	}
	public int sub(int a , int b) {
		return a - b;
	}
	
	public int mul(int a , int b) {
		return a * b;
	}
	public int div(int a , int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		MathOpperation mo = new MathOpperation();
		System.out.println("" + mo.add(5, 5));
		System.out.println("" + mo.sub(5, 5));
		System.out.println("" + mo.mul(5, 5));

		System.out.println("" + mo.div(5, 5));
	}

}
