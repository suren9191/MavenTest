package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateNewLead extends ProjectMethods{


	public CreateNewLead(RemoteWebDriver driver,ExtentTest test) 
	{
			this.driver = driver;
			this.test = test;
			PageFactory.initElements(driver, this);		
			System.out.println("Entered into the Create Lead Page");
			if(!verifyTitle("Create Lead | opentaps CRM")) 
			{
				throw new RuntimeException();
			}		
		}
		
		@FindBy(how=How.ID,using="createLeadForm_companyName")
		private WebElement eleTypeCname;
		public CreateNewLead enterCName(String data)
		{
			System.out.println("Entered into enterCName method");
			type(eleTypeCname, data);
			return this;
		}

	
		@FindBy(how=How.ID,using="createLeadForm_firstName")
		private WebElement eleTypeFirstName;
		public CreateNewLead enterFirstName(String data) {
			type(eleTypeFirstName, data);
			return this;		
		}
		
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement eleTypeLastName;
		public CreateNewLead enterLastName(String data) {
			type(eleTypeLastName, data);
			return this;		
		}
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleClickCreatLead;
		public ViewPage createLeadButton() {
			System.out.println("entered into createLead");
			click(eleClickCreatLead);
			return new ViewPage(driver, test);
		}
		
		

}
