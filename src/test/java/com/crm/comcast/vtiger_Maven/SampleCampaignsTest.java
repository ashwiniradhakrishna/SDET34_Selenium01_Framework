package com.crm.comcast.vtiger_Maven;

import org.testng.annotations.Test;

public class SampleCampaignsTest
{
	//it is used to create campaign
	@Test(groups="ST")
	public void CreateCampaignTest()
	{
		System.out.println("Campaign created"  +    System.getProperty("browser"));
	}
	
	
	@Test(groups="RT")
	public void ModifyCampaignTest()
	{
		System.out.println("Campaign modified");
	}
	
	
	@Test(groups="RT")
	public void DeleteCampaignTest()
	{
		System.out.println("Campaign deleted");
	}

}
