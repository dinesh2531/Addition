package com.add;



public class Addition {
	
public void add(int a, int b) {
		
		int c = a+b;
		
		System.out.println("Result is :"+c);
		
		
	}

  	
	
	
	public static void main(String[] args) {
		
		System.out.println("A1");
		System.out.println("A3");
		
		
		Addition ref = new Addition();
		
		//ref.add(2, 5);
		
		ref.add(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
	}
	

}
