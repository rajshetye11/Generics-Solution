package com.bridgelabz.genericssolution;

public class MaximumNumGen <T extends Comparable> {
	T n1, n2, n3;
	
	
	public MaximumNumGen(T n1, T n2, T n3)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public static <T extends Comparable<T>>void maximumNum(T n1, T n2,T n3){
		
		if ((n1.compareTo(n2) >= 0) && (n1.compareTo(n3) >= 0))
		{
            System.out.println( n1 + " is maximum number");
		}
		else if ((n2.compareTo(n1) >= 0) && (n2.compareTo(n1) >= 0)) 
		{
			System.out.println( n2 + " is maximum number");
		}
		else if ((n3.compareTo(n1) >= 0) && (n3.compareTo(n2) >= 0))
			System.out.println( n3 + " is maximum number");
		
	}
	
	public void maximumNum() {
		maximumNum(n1,n2,n3);
	}
	
	public static void main(String[] args) {
		Integer n1 = new Integer(22);
		Integer n2 = new Integer(69); 
		Integer n3 = new Integer(11);
		
		Float n4 = new Float(22.0);
		Float n5 = new Float(69.11); 
		Float n6 = new Float(11.15);
		
		String n7 = new String("Apple");
		String n8 = new String("Peach"); 
		String n9 = new String("Banana");
			
		new MaximumNumGen(n1,n2,n3).maximumNum();
		new MaximumNumGen(n4,n5,n6).maximumNum();
		new MaximumNumGen(n7,n8,n9).maximumNum();
	}
}
