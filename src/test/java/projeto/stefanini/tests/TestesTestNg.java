package projeto.stefanini.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import projeto.stefanini.actions.HomeActions;
import projeto.stefanini.actions.ProcurarVooActions;
import projeto.stefanini.actions.RegistroActions;

public class TestesTestNg {

	
	static WebDriver driver;
	static HomeActions actHome;
	static RegistroActions actReg;
	static ProcurarVooActions actProcVoo;
	
	@BeforeClass
	void abrirBrowser() {
		
System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		
		driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();
		
		actHome = new HomeActions(driver);
		
		actReg = new RegistroActions(driver);
		
		actProcVoo = new ProcurarVooActions(driver);
		
	}
	
	@Test
	void reservarPassagem() {
		
		Assert.assertEquals("http://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
		
		actHome.registro();
		
		Assert.assertTrue(driver.getTitle().contains("Register"), "Não está na página de registro!");
		
		actReg.novoRegistro();
		actHome.menuFlights();
		actProcVoo.procurarVoo();
		
	}
	
	@AfterClass
	void fecharBrowser() {
		driver.quit();
	}
	
	
	
	
}
