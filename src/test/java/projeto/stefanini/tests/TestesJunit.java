package projeto.stefanini.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projeto.stefanini.actions.HomeActions;
import projeto.stefanini.actions.ProcurarVooActions;
import projeto.stefanini.actions.RegistroActions;

class TestesJunit {
	
	static WebDriver driver;
	static HomeActions actHome;
	static RegistroActions actReg;
	static ProcurarVooActions actProcVoo;
	
// alt
	@BeforeAll
	static void abrirBrowser() {
		
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
	void reservaeprocurarvoo() {
		
		assertEquals("http://demo.guru99.com/test/newtours/index.php" , driver.getCurrentUrl());
		
		actHome.registro();
		actReg.novoRegistro();
		
		assertTrue(driver.getCurrentUrl().contains("register_sucess"), "O registro não foi criado!");
		
		actHome.menuFlights();
		actProcVoo.procurarVoo();
		
		
	}
	
	@AfterAll
	static void fecharBrowser() {
		
		driver.quit();
	}
	
	

}
