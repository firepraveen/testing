package com.interpoint.org;

	
public class Return {
public Integer amount = 1000;
public Integer collected () {
	System.out.println("I have collected the amount, the value is " + amount);
	return amount;
}
public static void main(String[] args) {
	Return return1 = new Return();
	Integer collected = return1.collected();
	System.out.println("The collected amount is " + collected);

	
}
}
