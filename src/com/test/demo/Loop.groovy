package com.test.demo

class Loop {

	static void main(args) {
		// TODO Auto-generated method stub
		
		// now learning 
		for (i in 0..10) {
			print(i) ; 
		}
		
		
		// simple for loop work as well
		for(int i  ; i < 5  ; i++) {
			println(i) ; 
		}
		
		1.upto(5) {println "$it"  }
		5.times { println "$it" }
		
		
		// also use the step key words 
		1.step(10, 2) { println "$it"  }
		
		
		// also use the list 
		for (i in [0,1,2,3,4]) {
			println("this is the list count ${i} ");
		}
		
		
		// now creating learning the using the key values pair 
		def map = ["name" : "shivam singh" , "company":"AMD"]
		for(e in map) {
			print(e.key)
			print(e.value)
		}
		
		// now checking for the while loop and implemet the while loop 
		int i = 1 ; 
		while(i<=5) {
			println "this is the while loop ${i}"
			i++ ; 
		}
	}
}
