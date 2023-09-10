package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABPLoginPages {
	WebDriver cd;
	By abpemail=By.id("CustomerEmail");
	By abppassword=By.id("CustomerPassword");
	By abpsignin=By.id("//*[@id=\"customer_login\"]/p[1]/button");
	
	public ABPLoginPages(WebDriver cd2) {
		// TODO Auto-generated constructor stub
		this.cd=cd2;
	}

	public void log(String email,String password)
	{
		cd.findElement(abpemail).sendKeys(email);
		cd.findElement(abppassword).sendKeys(password);
		cd.findElement(abpsignin).click();
	}
	

}

