package com.test.demo



class ExceptionHandeling {
	
   static void main(args) {
	   
	   
	   // write the just divide exception 
	   try {
		int i = 1/0 ; 
	} catch ( e) {
		
		println("this is the divde by Zero exception ") ; 
	}finally {
		println "this stament always running "
	}
	
	
	try {
		int i = 10 / 0   // divide by zero
		println(i)
	}
	catch (ArithmeticException e) {
		println("Caught ArithmeticException: divide by zero is not allowed")
	}
	catch (NullPointerException e) {
		println("Caught NullPointerException: null value used")
	}
	catch (Exception e) {
		println("Caught General Exception: ${e}")
	}
	finally {
		println("This statement always runs")
	}
}
	   
   }

