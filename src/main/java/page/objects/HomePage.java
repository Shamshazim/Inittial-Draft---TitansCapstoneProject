package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {
	
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement pageLogo;
	
	@FindBy (xpath = "//a[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement enterEmail;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement enterPassword;
	
	@FindBy (xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//h2[text()='My Account']")
	private WebElement successLogedIn;
	
	@FindBy (xpath= "//a[text()='Register for an affiliate account']")
	private WebElement clickOnRegisterAffiliateLink;
	
	@FindBy (id = "input-company")
	private WebElement enterCompanyName;
	
	@FindBy (id = "input-website")
	private WebElement enterWebsite;
	
	@FindBy (id = "input-tax")
	private WebElement enterTaxId;
		
	@FindBy (xpath = "//input[@checked='checked']")
	private WebElement selectCheguePayment;
	
	@FindBy (id = "input-cheque")
	private WebElement enterPayeeName;
	
	@FindBy (xpath = "//input[@name='agree']")
	private WebElement checkAboutUsCheckBox;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//*[@id='account-account']/div[1]/text()")
	private WebElement successLoginMessage;
	
	@FindBy (xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAccount;
	
	@FindBy (xpath = "//input[@value='bank']")
	private WebElement clickOnBankRadioButton;
	
	@FindBy (id = "input-bank-name")
	private WebElement bankName;
	
	@FindBy (id = "input-bank-branch-number")
	private WebElement abaOrBranchNumber;
	
	@FindBy (id = "input-bank-branch-number")
	private WebElement swiftCode;
	
	@FindBy (id = "input-bank-account-name")
	private WebElement accountName;
	
	@FindBy (id = "input-bank-account-number")
	private WebElement accountNumber;
	
	public boolean valadatePageLogo (){
		String logoText = pageLogo.getText();
		return true;
	}
	
	public void myAccountOption (){
		myAccount.click();
	}
	
	public void enterEmailValue (String email){
		enterEmail.sendKeys(email);
	}
	
	public void enterPasswordValue (String password){
		enterPassword.sendKeys(password);
	}
	
	public void clickLoginBtn (){
		loginButton.click();
	}
	
	public String getSuccessLogin (){
		String loginTxt = successLogedIn.getText();
			return loginTxt;
	}
	
	public void clickOnTheRegistrationAffiliateLink (){
		clickOnRegisterAffiliateLink.click();
	}
	
	public void enterCompanyNameValue (String companyName){
		enterCompanyName.sendKeys(companyName);
		
	}
	
	public void enterTaxIdValue (String taxId){
		enterTaxId.sendKeys(taxId);
	}
	
	public void enterWebsiteValue (String website){
		enterWebsite.sendKeys(website);
	}
	
	public void selectPayment(String optionSelect){
		if (optionSelect.equalsIgnoreCase("cheque") && !selectCheguePayment.isSelected()){
			selectCheguePayment.click();
		}
	}
	
	public void enterPayeeNameValue(String payeeName){
		enterPayeeName.sendKeys(payeeName);
	}
	
	public void checkTheAboutUsCheckBox (){
		if (!checkAboutUsCheckBox.isSelected()){
			checkAboutUsCheckBox.click();
		}
	}
	
	public void continueBtn (){
		continueButton.click();
	}
	
	public String  getSuccessLginMess(){
		String message = successLoginMessage.getTagName();
		return message;
	}
	
	public void clickOnEditAffiliateAccountLink () {
		editAffiliateAccount.click();
	}
	
//	public void selectBankAsPaymentOption(String selectPaymetType) {
//		if (selectPaymetType.equalsIgnoreCase("bank") && !clickOnBankRadioButton.isSelected()) {
//			clickOnBankRadioButton.click();
//		}
//		
//	}
	
	public void selectBankAsPaymentOption (String selectPayment) {
		if (selectPayment.equalsIgnoreCase("bank transfer") && ! clickOnBankRadioButton.isSelected()) {
			clickOnBankRadioButton.click();
		}
	}
	
	public void enterBankName(String bankNameValue) {
		bankName.sendKeys(bankNameValue);
		
	}

	public void enterAbaOrBranchNumber (String abaOrBranchValue) {
		abaOrBranchNumber.sendKeys(abaOrBranchValue);
	}
	
	public void enterSwiftCode (String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}
	
	public void enterAccountOwnerName (String ownerNameValue) {
		accountName.sendKeys(ownerNameValue);
	}
	
	public void enterAccountNumber (String accountNumberValue) {
		accountNumber.sendKeys(accountNumberValue);
	}
	
	

}
