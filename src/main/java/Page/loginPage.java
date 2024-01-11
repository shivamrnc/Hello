package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;


public class loginPage {

	protected WebDriver driver;



	private By txt_username = By.id("ap_email");

	private By btn_continue = By.className("a-button-input");

	private By txt_password = By.id("ap_password");


	private By btn_login = By.id("signInSubmit");
	private By txt_product = By.name("field-keywords");
	
	private By btn_SearchButton = By.id("nav-search-submit-button");
	
	
	
	public loginPage(WebDriver driver) {
		this.driver= driver;
	}


	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys("chaubeys123456@gmail.com");

	}


	public void clickcontinue() {
		driver.findElement(btn_continue).click();
	}


	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys("Abc@123456");
	}
	public void clicklogin() {
		driver.findElement(btn_login).click();
	}
	
//	public void ChecklogoutIsDisplayed() {
//		
//		driver.findElement(btn_logout).isDisplayed();
//	}
//	
//	
	public void enterProduct() {
		
		driver.findElement(txt_product ).sendKeys("iphone");
	}
//	
//	
	public void HitSearchButton() {
		
		driver.findElement(btn_SearchButton).sendKeys(Keys.RETURN);
	}
	
	
//	public void CheckElement() {
//		driver.findElement(btn_logoutCheck).isDisplayed();
//	}
//	
	public void loginValidUser(String username , String password) {
		driver.findElement(txt_username).sendKeys("chaubeys123456@gmail.com");
		driver.findElement(btn_continue).click();
		
		driver.findElement(txt_password).sendKeys("Abc@123456");
		driver.findElement(btn_login).click();
		
		driver.findElement(txt_product ).sendKeys("iphone");
		driver.findElement(btn_SearchButton).sendKeys(Keys.RETURN);
		
		
//		driver.findElement(txt_product).sendKeys("iphone");
//		driver.findElement(btn_SearchButton).sendKeys(Keys.RETURN);
//		driver.findElement(btn_logoutCheck).isDisplayed();
	
	}
	
}
