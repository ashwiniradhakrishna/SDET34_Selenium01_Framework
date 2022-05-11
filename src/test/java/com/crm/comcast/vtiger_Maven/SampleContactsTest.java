package com.crm.comcast.vtiger_Maven;

import org.testng.annotations.Test;

public class SampleContactsTest
{
	@Test(groups="ST")
	public void CreateContactTest()
	{
		System.out.println("contact created");
	}
	
	ashwini
	@Test(groups="RT")
	public void ModifyContactTest()
	{
		System.out.println("contact modified");
	}
	
	
	@Test(groups="RT")
	public void DeleteContactTest()
	{
		System.out.println("contact deleted");
	}
}

