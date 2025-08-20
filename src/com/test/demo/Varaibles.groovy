package com.test.demo

class Varaibles {

	static void main(args) {
		// TODO Auto-generated method stub
//		def Name = "AMD" ; 
//		String company = "amd" ; 
//	  
//		// try for the print using the variable and concatenation  
//		println("the company name is ${Name}") ; 
//		println("SAP LAB "+company)
//		
//		// it is still working file not a actually problems 
//		// try for the int variable 
//		int Number = 78 ; 
//		print(Number)
//        // and check for the printing 
//		
//		
//		// now learning the Assignment 
//		def(int A,int B, int C) = [40,50]
//	    // check for the printing 
//		println(A) ; 
//		print(B) ; 
//		print(C) ; 
//		
//		// CREATING and Assign Variable 
//		def(String Company_name , int Company_number , int values ) = [45,78,65]
//		// check for the print all the variables 
//		println(Company_name) ; 
//		println(Company_number)
//		println(values)
//		
//		
//		// again try for one less variable 
//		def(String nam , int num , int sh) = [6,7]
//        // try the print the variable 
//		print(nam) ; 
//		println(num) ; 
//		println(sh) ; 		
		
		// Basic variable assignment
		def name = "AMD"
		String company = "amd"

		// Printing variables
		println("The company name is ${name}")
		println("SAP LAB " + company)

		// Integer variable
		int number = 78
		println(number)

		// Correct destructuring assignment
		def (a, b) = [40, 50]
		println(a)
		println(b)

		// If you want 3 vars, give 3 values
		def (x, y, z) = [45, 78, 65]
		println(x)
		println(y)
		println(z)

		// If fewer values than vars → missing ones become null
		def (p, q, r) = [6, 7]
		println(p)   // 6
		println(q)   // 7
		println(r)   // null
		
	}
}
