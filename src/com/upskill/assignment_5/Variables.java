package com.upskill.assignment_5;

public class Variables {
	
	//	Variables in Java
	
	String country = "USA";				//Instance OR global variable - Variables declared in Class level, outside method
	
	static String name = "Rupa";		//Static variable - variables belong to class and don't required creating object


	public static void main(String[] args) {
		
		String city = "NYC";						//Local variable - variables declared in methods 

	}
	
	public static void myMethod(){
		
		String city = "Long Island";				//Local variable - variables declared in methods 
		
	}
	
	public static void myMethod2(String county){	//Method parameter - variables used as method parameter
		
		String city = "Bloomfield";					//Local variable - variables declared in methods 
		
	}

}
