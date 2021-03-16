package projeto.stefanini.actions;

import org.openqa.selenium.WebDriver;

import projeto.stefanini.pageobjects.HomeObjects;

public class HomeActions {
	
	static HomeObjects obj;
		
	public HomeActions(WebDriver driver) {
		
		obj = new HomeObjects(driver);
		
		
	}
	
	
	public void login() {
		
		obj.getInputUsername().sendKeys("Caue");
		obj.getInputSenha().sendKeys("12345");
		obj.getButLogin().click();
		
	}
	
	
	public void registro() {
		
		obj.getLinkRegister().click();
		
	}
	
	public void menuFlights() {
		
		obj.getMenuFlights().click();
		
	}
		
	

}
