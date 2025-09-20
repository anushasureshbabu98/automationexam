package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickcontact {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/form/div[1]/input")WebElement name;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/form/div[2]/input")WebElement phone;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/form/div[3]/input")WebElement email;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/form/div[4]/textarea")WebElement message;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/form/input")WebElement sent;
	public Quickcontact() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void details(String nm,String ph,String em,String msg) {
		name.sendKeys(nm);
		phone.sendKeys(ph);
		email.sendKeys(em);
		message.sendKeys(msg);
		sent.click();
	}
}
