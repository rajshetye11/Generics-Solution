package com.bridgelabz.genericssolution;

public class MaximumNum {
	
	public void maxNumbers(String n1, String n2,String n3) {
		if((n1.compareTo(n2)>=0) && (n1.compareTo(n3)>=0))
		{
			System.out.println(n1+" is maximum number");
		}
		else if((n2.compareTo(n1)>=0) && (n2.compareTo(n3)>=0))
		{
			System.out.println(n2+" is maximum number");
		}
		else if((n3.compareTo(n1)>=0) && (n3.compareTo(n2)>=0))
		{	
			System.out.println(n3+" is maximum number"); 
		}
	}
	public static void main(String[] args) {
	
		String n1 = new String("Apple");
		String n2 = new String("Peach"); 
		String n3 = new String("Banana");
		
		MaximumNum mn = new MaximumNum();
		mn.maxNumbers(n1, n2, n3);
		
	}
}
