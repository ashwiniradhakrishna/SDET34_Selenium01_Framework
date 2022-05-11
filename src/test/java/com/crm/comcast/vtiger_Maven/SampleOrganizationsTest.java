package com.crm.comcast.vtiger_Maven;

import org.testng.annotations.Test;

public class SampleOrganizationsTest
{
	@Test(groups="ST")
	public void CreateOrganizationTest()
	{
		System.out.println("Organization created");
	}
	
	@Test(groups="RT")
	public void ModifyOrganizationTest()
	{
		System.out.println("Organization modified");
	}
	
	@Test(groups="RT")
	public void DeleteOrganizationTest()
	{
		System.out.println("Organization deleted");
	}

}
