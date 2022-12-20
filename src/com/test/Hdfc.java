package com.test;

public class Hdfc implements Rbi {

	@Override
	public void savings() {
		System.out.println("55");
		
		
	}

	@Override
	public void fixed() {
		System.out.println("67");


		
	}
	public static void main(String[]args) {
		Hdfc h = new Hdfc();
		h.savings();
		h.fixed();
	}

}
