/* In Anonymous Class methods can be used only 1 time. 
  Anonymous Class can be created by 2 ways.
   1. By extending abstract class.
   2. By implementing an interface.   */

package com.edu;

 abstract class Vehicle{
	  abstract void driver();
	  abstract void car();
}
   
 interface Human{
	 void walk();
	 void run();
 }

public class AnonymousClassConcept {

	public static void main(String[] args) {
		
		Vehicle obj=new Vehicle() {  // Vehicle= anonymous class
			@Override
			void driver() {
				System.out.println("I am driving a bike");
			}
			@Override
			void car() {
				System.out.println("I am driving a car....");
			}
		};
		obj.driver();
		obj.car();
		
		System.out.println("-----------------------------------------");
         
		Human Kaleem=new Human() {   //new Human= anonymous class
			@Override
			public void walk() {
				System.out.println("Kaleem Walks......");
			}
			@Override
			public void run() {
				System.out.println("Kaleem is running....");
			}
		};
		Kaleem.walk();
		Kaleem.run();
	}

}
