	package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("opentaps CRM")) {
			throw new RuntimeException();
		}		
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleTypeCName;
	public EditLead enterCName(String data) {
		type(eleTypeCName, data);
		return this;		
	}

	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleClearCompanyField;
	public EditLead clearField() {
		eleClearCompanyField.clear();
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdatebutton;
	public ViewPage clickUpdateButton(){
		
		click(eleUpdatebutton);
		System.out.println("After updating the company name entered into View page");
		return new ViewPage(driver, test);
	}
}
