package com.upskill.java_2;

class IflsesStatement {
	
	static int age = 65;

	public static void main(String[] args) {
	    age();

	}
	
	public static void age() {
	
		if (age< 13){
			 System.out.println("You are children");
		} else if (age< 13 && age < 18){
			System.out.println("You are Teenager");
		} if (age > 60){
				 System.out.println("You are senior");
		}else {
			System.out.println("You are adult");
			// Nested If Else Statement
			if (age< 13){
				 System.out.println("You are children");
		}
	}

}
