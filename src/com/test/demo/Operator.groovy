package com.test.demo
class Operator {
	// hear we will  learning groove 
	static void main(args){
		
		assert 2%2 == 0  ; 
		assert 4/5 == 0.8 ; 
		assert 5+5 == 10 ; 
		assert 6-4 == 2 ; 
		
		// now learning the post increment assert using for the comparison 
		def e = 8 ; 
		println(++e) ; 
		println(e++) ; 
		println(e) ; 
		
		// now using for the sample opeartor using like the java 
		
		// write the condition for the program 
		if (6/2 == 3 && true) {
			println(true) ; 
		}
		
		// using the || or operator 
		int a  =20 ; 
		int b = 50 ; 
		
		// now convert all the in the binary string 
		println Integer.toBinaryString(a)
		println Integer.toBinaryString(b)
		
		// this is the vary condition 
		// ! not operator 
		println(!true)
		
		// check for the xor operator 
		println(true^false) ; 
		println(true^true) ; 
		
		// now creating the one line opeartor 
		def output = (5>6)?"this is the ture" : "this is the false"
		
		// this is the called operator 
		println output ; 
		
		
	
	}
}
