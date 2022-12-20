package com.first;

public class Hdfc extends Rbi  {

	@Override
	public void savings() {
		System.out.println("4%");
		
	}
	public static void main(String[]args) {
		Hdfc h=new Hdfc();
		h.savings();
		h.fixed();
	}

}
