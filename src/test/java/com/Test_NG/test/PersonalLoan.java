package com.Test_NG.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {

	
	@Test(groups={"Smoke"})
	public void personalLoan()
	{
		System.out.println("good");
	}


	@BeforeTest
	public void preRequest()
	{
		System.out.println("I will execute first_BeforeTest");
	}
}
