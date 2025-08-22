package com.test.demo

class Closer {

	static void main(args) {
		// TODO Auto-generated method stub
		def myClosure = { println "Hellow world "}
		
		// this is the simple closer 
		def sum = {sun -> println "number is $sun"} ; 
		
		// now call the 
		sum.call(34) ; 
		
		// creating the close with the multiple variable 
		def vari = {a,b,c -> return a+b+c} ; 
		
		// creating the function 
		def res = vari(4,5,6) ; 
		println res ; 
		
		
		//creating the list 
		def mymap = ["subject" : "groovy" , 
			"topic " : "groovy"]
		
		 mymap.each {it}
		 def myList = [1,2,3,4,5]
		 
		 println myList.find {item -> item == 3}
		 
		
	}
}
