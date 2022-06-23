package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;

public class RetailStepDefinition extends Base {
	
	HomePage homePage = new HomePage();
	

	@Given ("user is on the home page")
	public void user_is_on_the_home_page (String messageExpected){
		Assert.assertTrue(homePage.valadatePageLogo());
		Assert.assertEquals(messageExpected, homePage.valadatePageLogo());
		logger.info("user successfully logged in into the account");
		
	}
	
	@When ("user click on MyAccount")
	public void user_click_on_MyAccount (){
		homePage.myAccountOption();
		logger.info("user clicked on myAccount");
		
	}
	
	@And ("user click on login option")
	public void user_click_on_login_option(){
		homePage.clickLoginBtn();
		
	}
	@And ("user enter user name {string} and password {string}")
	public void user_enter_username_and_password (String email, String password){
		homePage.enterEmailValue(email);
		logger.info("user entered the email");
		homePage.enterPasswordValue(password);
		logger.info("User entered the password");
		
	}
	@And ("user click on the login button")
	public void user_click_on_the_login_button (){
		homePage.clickLoginBtn();
		logger.info("User clicked on login button");
		
	}
	@Then ("user should be able to logged into account")
	public void user_should_able_to_logged_into_account (String expectedMessage){
		Assert.assertEquals(expectedMessage, homePage.getSuccessLogin());
		logger.info("User successfuly logged in");
	}
		
		@Given ("user click on the Register for an Affiliate account link")
		public void user_click_on_the_Registration_for_an_Affiliate_account_link (){
			homePage.clickOnTheRegistrationAffiliateLink();
			logger.info("user clicked on the registration link");
		}
	    @And ("user fill affiliate form with below information")
	    public void user_fill_affiliate_form_below_information(DataTable dataTable){
	    List <Map<String, String>> listInfo = dataTable.asMaps(String.class, String.class);
	    homePage.enterCompanyNameValue(listInfo.get(0).get("companyName"));
	    homePage.enterWebsiteValue(listInfo.get(0).get("website"));
	    homePage.enterTaxIdValue(listInfo.get(0).get("taxId"));
	    homePage.selectPayment(listInfo.get(0).get("cheque"));
	    homePage.enterPayeeNameValue(listInfo.get(0).get("payeeName"));
	    logger.info("user entered affiliate register info");
	    		
	    }
//	    |company|website|taxID|paymentMethod|Payee Name|
	   	@And ("user check on About us check box")
	   	public void user_check_on_About_us_check_box (){
	   		homePage.checkTheAboutUsCheckBox();
	   		logger.info("user checked About us check box");
	   	}
	    @And ("user click on Continue button")
	    public void user_click_on_Continue_button (){
	    	homePage.continueBtn();
	    	logger.info("user clicked on continue button");
	    }
	    @Then ("user should see a success message")
	    public void user_should_see_a_success_message(String expectedMessage){
	    	Assert.assertEquals(expectedMessage, homePage.getSuccessLginMess());
	    	logger.info("user successfuly registered as affiliate");
	    	
	    	@Given ("User click on Edit your affiliate informationlink")
	        public void user_click_on_Edit_your_affiliate_informationlink() {
	    		homePage.clickOnEditAffiliateAccountLink();
	        }
	       
	        @And ("user click on Bank Transfer radio button")
	        public void user_click_on_bank_transfer_radio_button() {
	        	homePage.selectBankAsPaymentOption("bank transfer");
	        }
	        
	        And User fill Bank information with below information
	          | bankName | abaNumber | swiftCode | accountName | accountNumber |
	        And User click on Continue button
	        Then User should see a success message
		
	}

}
