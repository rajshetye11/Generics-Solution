package com.bridgelabz.genericssolution;

public class MaximumNum {
	
	public void maxNumbers(Float n1, Float n2,Float n3) {
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
	
		Float n1 = new Float(22.0);
		Float n2 = new Float(69.11); 
		Float n3 = new Float(11.15);
		
		MaximumNum mn = new MaximumNum();
		mn.maxNumbers(n1, n2, n3);
		
	}
}
