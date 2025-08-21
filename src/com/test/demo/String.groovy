package com.test.demo

import com.test.demo.String

class String {

	static void main(args) {
		// TODO Auto-generated method stub
		
		// double "" string and single quests string 
		// triple single quoted quoted quoted string 
		// triple double  quoted 
		def name = "shivam" ; 
		println name ; 
		println "my name is "+"shivam" ; 
		println "my second name is ".concat("shivam") ; 
		println "my name is $name" ; 
		println "my name is ${name}"  ; 
		
		
		def s1 =  """this is the groove class 
this is the my second line but print the the samle line using the triple single code or the triple double ciode 
 """  ; 
 
 // now print the length 
 println s1.length()
  // print the text using the index number and also the - index using the print from the back 
 println s1[2] ; 
 println s1[-2]	 ; 
 
 println name[0..2] ; 
 
 // noe find the index of the char 
 println name.indexOf('m') ; 
 // also create a sub string using the substring function 
 println name.substring(1, 4) ; 
 
 // also we can using the split using the spcae 
 println s1.split(" ") ; 
 
 // also we can use the replace function for the replacing any thing 
 println name.toUpperCase() ; 
 println name.toLowerCase()  ; 
 
 
 // also can convert in the todo list 
 println name.toList()  ; 
 println name.equals("shivam") ; 
 println name.equalsIgnoreCase("shivam") ; 
 
 // this is the also part of the string 
 def s3 = /a green skey /
 def s5 = $/ a name is $name/$
 def s6 = / a name is $name/
 
 
 
 
	 	
	}
}
