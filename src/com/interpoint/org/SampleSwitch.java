package com.interpoint.org;

public class SampleSwitch {
	String myName = "Praveen";

public void check() {

switch (myName) {
case "kumar": {
	
	System.out.println("Your name is kumar");
	break;
}
case "Praveen": {
	
	System.out.println("Your name is Praveen");
	break;
}
case "ok": {
	
	System.out.println("Your name is ok");
	break;
}}}


	public static void main(String[] args) {
		SampleSwitch sampleSwitch = new SampleSwitch();
		sampleSwitch.check();
	}
}
