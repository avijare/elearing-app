package com.app.sbi;

import com.app.PwdSecurity;

public class UserRegistration {
	
	public static void main(String[] args) {
		
		PwdSecurity pss = new PwdSecurity();
		String encode = pss.encode("Avinash");
		System.out.println(encode);
				
	}

}
