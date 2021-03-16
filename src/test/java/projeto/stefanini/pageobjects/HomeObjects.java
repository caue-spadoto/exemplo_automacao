package projeto.stefanini.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {
	
	private WebDriver driver;
	
	@FindBy(linkText="REGISTER")
	private WebElement linkRegister;
	
	@FindBy (name="userName")
	private WebElement inputUsername;
	
	@FindBy(name="password")
	private WebElement inputSenha;
	
	@FindBy(name="submit")
	private WebElement butLogin;
	
	@FindBy(linkText="Home")
	private WebElement menuHome;
	
	@FindBy(linkText="Flights")
	private WebElement menuFlights;
	

	public HomeObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLinkRegister() {
		return linkRegister;
	}

	public void setLinkRegister(WebElement linkRegister) {
		this.linkRegister = linkRegister;
	}

	public WebElement getInputUsername() {
		return inputUsername;
	}

	public void setInputUsername(WebElement inputUsername) {
		this.inputUsername = inputUsername;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public void setInputSenha(WebElement inputSenha) {
		this.inputSenha = inputSenha;
	}

	public WebElement getButLogin() {
		return butLogin;
	}

	public void setButLogin(WebElement butLogin) {
		this.butLogin = butLogin;
	}

	public WebElement getMenuHome() {
		return menuHome;
	}

	public void setMenuHome(WebElement menuHome) {
		this.menuHome = menuHome;
	}

	public WebElement getMenuFlights() {
		return menuFlights;
	}

	public void setMenuFlights(WebElement menuFlights) {
		this.menuFlights = menuFlights;
	}
	
	
	
	
	
	

}
