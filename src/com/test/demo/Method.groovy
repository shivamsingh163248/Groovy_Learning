package com.test.demo

class Method {
	
	static void userAccess(def name) {
		// bank-related method
		if (name.equals("shivam")) {
			println("Customer name is ${name}")
		} else {
			println("Access denied for ${name}")
		}
	}

	static void main(args) {
		// calling the method
		userAccess("shivam")    // ✅ will print
		userAccess("ram")       // ❌ will print Access denied
	}
}
