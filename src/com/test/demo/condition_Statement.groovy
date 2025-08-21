package com.test.demo

class condition_Statement {

	static void main(args) {
		// TODO Auto-generated method stub
		
		// creating the if statement
		def x = false ; 
		 
		if (x == true) {
			print("x would be true statment ") ; 
		}else {
			print("X would be false statment ") ; 
		}
		
		
		// now learning the switch case 
		
		def t = 2  ; 
		def result = " " ; 
		switch(t) {
			case 0 :
			println("this is the number is zero") ;
            break ; 
			case 2 :
			println("second");
			break ;
			default:
			println("thired");
			break ;
			
		}
		
	}
}
