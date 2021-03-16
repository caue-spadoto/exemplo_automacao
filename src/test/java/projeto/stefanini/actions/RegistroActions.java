package projeto.stefanini.actions;

import org.openqa.selenium.WebDriver;

import projeto.stefanini.pageobjects.RegistroObjects;

public class RegistroActions {
	
	static RegistroObjects objRegistro;
	
	public RegistroActions(WebDriver driver) {
		
		objRegistro = new RegistroObjects(driver);
		
	}
	
	public void novoRegistro() {
		
		objRegistro.getInputFirstName().sendKeys("Caue");
		objRegistro.getInputLastName().sendKeys("Spadoto");
		objRegistro.getInputPhone().sendKeys("19991111111");
		objRegistro.getInputEmail1().sendKeys("caue@caue.com");
		objRegistro.getInputEndereco().sendKeys("Rua São João, 35");
		objRegistro.getInputCidade().sendKeys("São Paulo");
		objRegistro.getInputEstado().sendKeys("São Paulo");
		objRegistro.getInputCep().sendKeys("13520000");
		objRegistro.getSelectPais().click();
		objRegistro.getSelecionaBrazil().click();
		objRegistro.getInputEmail().sendKeys("Caue");
		objRegistro.getInputPassword().sendKeys("12345");
		objRegistro.getInputConfirmaPassword().sendKeys("12345");
		objRegistro.getButResgistrar().click();
		
	}
	
	
	
	

}
