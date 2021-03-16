package projeto.stefanini.actions;

import org.openqa.selenium.WebDriver;

import projeto.stefanini.pageobjects.ProcurarVooObjcts;

public class ProcurarVooActions {
	
	static ProcurarVooObjcts objProcVoo;
	
	public ProcurarVooActions(WebDriver driver) {
		
		objProcVoo = new ProcurarVooObjcts(driver);
				
	}
	
	public void procurarVoo( ) {
		
		objProcVoo.getRadioOneWay().click();
		objProcVoo.getSelectQuatPassageiros().click();
		objProcVoo.getSelectVale2().click();
		objProcVoo.getSelectCidadeIda().click();
		objProcVoo.getSelectLondon().click();
		objProcVoo.getSelectMesIda().click();
		objProcVoo.getSelect5().click();
		objProcVoo.getSelectDiaIda().click();
		objProcVoo.getSelectVale14().click();
		objProcVoo.getSelectCidadeVolta().click();
		objProcVoo.getSelectParis().click();
		objProcVoo.getSelectMesVolta().click();
		objProcVoo.getSelect6().click();
		objProcVoo.getSelectDiaVolta().click();
		objProcVoo.getSelectVale21().click();
		objProcVoo.getRadioBusiness().click();
		objProcVoo.getButProcurarVoo().click();
		
		
	}

}
