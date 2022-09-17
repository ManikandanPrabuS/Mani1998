package org.returntype;

public class ClassB {
	
	public static void main(String[] args) {
		
//		ClassA x = new ClassA();
//		
//		String ans = x.add(10,20);
//		System.out.println(ans);
//		
//		if (ans.equals("java")) {
//			System.out.println("Valid");
//			
//		} else {
//			System.out.println("Invalid");
//
//		}
		
	ClassA x = new ClassA();
		
		int add = x.add(10, 40);
		System.out.println(add);
		
		if (add == 43) {
			System.out.println("Valid");
			
		} else {
			System.out.println("Invalid");

		}
	}
	}


