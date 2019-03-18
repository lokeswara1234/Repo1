/**
 * 
 */
package com.Facebook.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.qa.Base.TestBase;

/**
 * @author lokes
 *
 */
public class LoginPage extends TestBase{
                    //PageFactory-->OR 
	        @FindBy(name="username")
	        WebElement username;
	        @FindBy(name="password")
	        WebElement password;
	        @FindBy(xpath="//button[@id='loginbutton']")
	        WebElement loginBtn;
	        @FindBy(xpath="//a[@id='forgot-password-link']")
	        WebElement forgotpasswordlink;
	        @FindBy(xpath="//a[@className='_42ft _4jy0 _4jy6 _4jy2 selected _51sy']")
	        WebElement CreateNewAccount;
	        @FindBy(id="blueBarDOMInspector")
	        WebElement FacebookLogo;
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public static  String validateloginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateFacebookLogo()
	{
		return FacebookLogo.isDisplayed();
	}
	public String login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
        return new String();
		
	}
	
	
	
              	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
