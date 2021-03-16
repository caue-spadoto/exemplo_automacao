package projeto.stefanini.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroObjects {
	
	private WebDriver driver;
	
	@FindBy(name="firstName")
	private WebElement inputFirstName;
	
	@FindBy (name="lastName")
	private WebElement inputLastName;
	
	@FindBy(id="userName")
	private WebElement inputEmail1;
	
	@FindBy(name="phone")
	private WebElement inputPhone;
	
	@FindBy(name="address1")
	private WebElement inputEndereco;
	
	@FindBy(name="city")
	private WebElement inputCidade;
	
	@FindBy(name="state")
	private WebElement inputEstado;
	
	@FindBy(name="postalCode")
	private WebElement inputCep;
	
	@FindBy(name="country")
	private WebElement selectPais;
	
	@FindBy(css="option[value='BRAZIL']")
	private WebElement selecionaBrazil;
	
	@FindBy(id="email")
	private WebElement inputEmail;
	
	@FindBy(name="password")
	private WebElement inputPassword;
	
	@FindBy(name="confirmPassword")
	private WebElement inputConfirmaPassword;
	
	@FindBy(name="submit")
	private WebElement butResgistrar;

	public RegistroObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public void setInputFirstName(WebElement inputFirstName) {
		this.inputFirstName = inputFirstName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public void setInputLastName(WebElement inputLastName) {
		this.inputLastName = inputLastName;
	}

	public WebElement getInputEmail1() {
		return inputEmail1;
	}

	public void setInputEmail1(WebElement inputEmail1) {
		this.inputEmail1 = inputEmail1;
	}

	public WebElement getInputPhone() {
		return inputPhone;
	}

	public void setInputPhone(WebElement inputPhone) {
		this.inputPhone = inputPhone;
	}

	public WebElement getInputEndereco() {
		return inputEndereco;
	}

	public void setInputEndereco(WebElement inputEndereco) {
		this.inputEndereco = inputEndereco;
	}

	public WebElement getInputCidade() {
		return inputCidade;
	}

	public void setInputCidade(WebElement inputCidade) {
		this.inputCidade = inputCidade;
	}

	public WebElement getInputEstado() {
		return inputEstado;
	}

	public void setInputEstado(WebElement inputEstado) {
		this.inputEstado = inputEstado;
	}

	public WebElement getInputCep() {
		return inputCep;
	}

	public void setInputCep(WebElement inputCep) {
		this.inputCep = inputCep;
	}

	public WebElement getSelectPais() {
		return selectPais;
	}
	
	

	public WebElement getSelecionaBrazil() {
		return selecionaBrazil;
	}

	public void setSelecionaBrazil(WebElement selecionaBrazil) {
		this.selecionaBrazil = selecionaBrazil;
	}

	public void setSelectPais(WebElement selectPais) {
		this.selectPais = selectPais;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public WebElement getInputConfirmaPassword() {
		return inputConfirmaPassword;
	}

	public void setInputConfirmaPassword(WebElement inputConfirmaPassword) {
		this.inputConfirmaPassword = inputConfirmaPassword;
	}

	public WebElement getButResgistrar() {
		return butResgistrar;
	}

	public void setButResgistrar(WebElement butResgistrar) {
		this.butResgistrar = butResgistrar;
	}
	
	

}
