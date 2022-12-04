package com.interpoint.org;

public class MyAccount {
Long balance = 12343434l;
String nameString = "Arun";
String address = "No.14, Raja raja street";

public void mybalance () {
	System.out.println("My account balance is " + balance);
	System.out.println("My address is " + address);
	System.out.println("My name is " + nameString);
}
public static void main(String[] args) {
	MyAccount account = new MyAccount();
	account.mybalance();
}
}
