package com.bridgelabz.genericssolution;

public class MaximumNum {
	
	public void maxNumbers(Integer n1, Integer n2, Integer n3) {
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
	
		Integer n1 = new Integer(22);
		Integer n2 = new Integer(69);
		Integer n3 = new Integer(11);
		
		MaximumNum mn = new MaximumNum();
		mn.maxNumbers(n1, n2, n3);
		
	}
}
