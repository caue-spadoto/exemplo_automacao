package projeto.stefanini.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcurarVooObjcts {
	
	private WebDriver driver;
	
	@FindBy(css="input[value='oneway']")
	private WebElement radioOneWay;
	
	@FindBy(name="passCount")
	private WebElement selectQuatPassageiros;
	
	@FindBy(css="option[value='2']")
	private WebElement selectVale2;
		
	@FindBy(name="fromPort")
	private WebElement selectCidadeIda;
	
	@FindBy(css="option[value='London']")
	private WebElement selectLondon;
	
	@FindBy(name="fromMonth")
	private WebElement selectMesIda;

	@FindBy(css="option[value='5']")
	private WebElement select5;
		
	@FindBy(name="fromDay")
	private WebElement selectDiaIda;
	
	public WebElement getSelect5() {
		return select5;
	}

	public void setSelect5(WebElement select5) {
		this.select5 = select5;
	}

	public WebElement getSelect6() {
		return select6;
	}

	public void setSelect6(WebElement select6) {
		this.select6 = select6;
	}

	@FindBy(css="option[value='14']")
	private WebElement selectVale14;
	
	@FindBy(name="toPort")
	private WebElement selectCidadeVolta;
	
	@FindBy(css="option[value='Paris']")
	private WebElement selectParis;
	
	@FindBy(name="toMonth")
	private WebElement selectMesVolta;
	
	@FindBy(css="option[value='6']")
	private WebElement select6;
	
	@FindBy(name="toDay")
	private WebElement selectDiaVolta;
	
	@FindBy(css="option[value='21']")
	private WebElement selectVale21;
	
	@FindBy(css="input[value='Business']")
	private WebElement radioBusiness;
	
	@FindBy(name="airline")
	private WebElement selectCompaniaAerea;
	
	@FindBy(name="findFlights")
	private WebElement butProcurarVoo;

	public ProcurarVooObjcts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioOneWay() {
		return radioOneWay;
	}

	public void setRadioOneWay(WebElement radioOneWay) {
		this.radioOneWay = radioOneWay;
	}

	public WebElement getSelectQuatPassageiros() {
		return selectQuatPassageiros;
	}

	public void setSelectQuatPassageiros(WebElement selectQuatPassageiros) {
		this.selectQuatPassageiros = selectQuatPassageiros;
	}
	
	

	public WebElement getSelectVale2() {
		return selectVale2;
	}

	public void setSelectVale2(WebElement selectVale2) {
		this.selectVale2 = selectVale2;
	}

	public WebElement getSelectCidadeIda() {
		return selectCidadeIda;
	}

	public void setSelectCidadeIda(WebElement selectCidadeIda) {
		this.selectCidadeIda = selectCidadeIda;
	}

	public WebElement getSelectMesIda() {
		return selectMesIda;
	}

	public void setSelectMesIda(WebElement selectMesIda) {
		this.selectMesIda = selectMesIda;
	}

	public WebElement getSelectDiaIda() {
		return selectDiaIda;
	}

	public void setSelectDiaIda(WebElement selectDiaIda) {
		this.selectDiaIda = selectDiaIda;
	}

	public WebElement getSelectCidadeVolta() {
		return selectCidadeVolta;
	}

	public void setSelectCidadeVolta(WebElement selectCidadeVolta) {
		this.selectCidadeVolta = selectCidadeVolta;
	}

	public WebElement getSelectMesVolta() {
		return selectMesVolta;
	}

	public void setSelectMesVolta(WebElement selectMesVolta) {
		this.selectMesVolta = selectMesVolta;
	}

	public WebElement getSelectDiaVolta() {
		return selectDiaVolta;
	}

	public void setSelectDiaVolta(WebElement selectDiaVolta) {
		this.selectDiaVolta = selectDiaVolta;
	}

	public WebElement getRadioBusiness() {
		return radioBusiness;
	}

	public void setRadioBusiness(WebElement radioBusiness) {
		this.radioBusiness = radioBusiness;
	}

	public WebElement getSelectCompaniaAerea() {
		return selectCompaniaAerea;
	}

	public void setSelectCompaniaAerea(WebElement selectCompaniaAerea) {
		this.selectCompaniaAerea = selectCompaniaAerea;
	}

	public WebElement getButProcurarVoo() {
		return butProcurarVoo;
	}

	public void setButProcurarVoo(WebElement butProcurarVoo) {
		this.butProcurarVoo = butProcurarVoo;
	}

	public WebElement getSelectLondon() {
		return selectLondon;
	}

	public void setSelectLondon(WebElement selectLondon) {
		this.selectLondon = selectLondon;
	}

	
	public WebElement getSelectVale14() {
		return selectVale14;
	}

	public void setSelectVale14(WebElement selectVale14) {
		this.selectVale14 = selectVale14;
	}

	public WebElement getSelectParis() {
		return selectParis;
	}

	public void setSelectParis(WebElement selectParis) {
		this.selectParis = selectParis;
	}

	
	public WebElement getSelectVale21() {
		return selectVale21;
	}

	public void setSelectVale21(WebElement selectVale21) {
		this.selectVale21 = selectVale21;
	}
	
	
	

	
}
