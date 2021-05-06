package com.Test_NG.test;


//rahulonlinetutor@gmail.com

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void WebLoginHomeLoan(String urlName, String username)
	{
		//selenium
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlName);
		System.out.println(urlName);


	}
//
//
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}
//
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("LoginAPIHomeLoan");
	}
}
