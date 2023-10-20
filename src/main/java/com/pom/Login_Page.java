package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Login_Page extends Base {
	{
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//p[text()='Username : Admin']") private WebElement username;
@FindBy(xpath="//p[text()='Password : admin123']") private WebElement password;
@FindBy(name="username") private WebElement inputusername;
@FindBy(name="password") private WebElement inputpassword;
@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;


 public String getUsername()
 {
	
	
	String name = username.getText();
	return name.substring(name.indexOf(':'),name.length()-1);
	 
	
 }
 
 public String getPassword()
 {
	 String pass= password.getText();
	 return pass.substring(pass.indexOf(':'));
 }
 public void setUsername(String Setusername) {
	 inputusername.sendKeys(Setusername);
}


public void setPassword(String Setpassword) {
	 inputpassword.sendKeys(Setpassword);



}
  public void ClickOnLoginButton()
     {
    	 LoginButton.click();
     }


	

	 
 }
