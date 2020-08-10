package com.avamo.testassignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avamo.testassignment.qa.Base.BaseClass;

public class HomePage extends BaseClass
{
	
	//Page Factory - Object Repository
	@FindBy(className = "avm-bot-icon animated avmIconIn")
	WebElement BotIcon;
	
	//Initializing the Page Objects:
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String ValidateHomePage(){
			return driver.getTitle();
		}
	


}
