package com.avamo.testassignment.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.avamo.testassignment.qa.Base.BaseClass;
import com.avamo.testassignment.qa.pages.HomePage;
import com.avamo.testassignment.qa.utilities.testUtil;

public class VerifyHomePage extends BaseClass
{
	HomePage homePage;
	testUtil testutil;

public VerifyHomePage() 
{
	super();
}
@BeforeTest
public void setUp() {
	initialization();

	testutil = new testUtil();
	homePage = new HomePage();
	
}

@Test
public void verifyHomePageTitleTest(){
	String homePageTitle = homePage.ValidateHomePage();
	Assert.assertEquals(homePageTitle, "HTML","Home page title not matched");
}

@Test
public void test() {
	
}

@AfterTest
public void tearDown(){
	driver.quit();
}
}