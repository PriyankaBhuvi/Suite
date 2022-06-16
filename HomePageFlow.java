package com.flows;

import genric.BaseTest;
import genric.Pojo;
import pageFactory.HomePage;

public class HomePageFlow extends BaseTest {

	
	
	private Pojo objPojo;
	private HomePage objHomePage;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo = pojo;
		objHomePage = new HomePage(objPojo);
	}
	
	public void checkHomePage() {

        objHomePage.verifyHomeTextIsDisplayedInHomePage();
}
}

	
	
	
	
	
	
	

