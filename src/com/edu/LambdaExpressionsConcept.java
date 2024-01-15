/* Lambda Expressions were introduced in Java 8. We can use Lambda expressions only in FuntionalInterface.   */ 

package com.edu;

@FunctionalInterface   //FunctionalInterface annotation describes only 1 method present in an Interface. 
interface Expression{
	void algebric(int a,int b);   //(int a,int b)= parameters
}

public class LambdaExpressionsConcept {

	public static void main(String[] args) {
		
		Expression obj=(a,b)->{   // reference = Expression Interface
			System.out.println("The value of a and b is: "+a+","+b);
		};
		obj.algebric(6,8);  //argument(6,8)
		obj.algebric(1,2);
	}

}
 