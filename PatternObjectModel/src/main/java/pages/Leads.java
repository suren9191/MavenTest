package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class Leads extends ProjectMethods{

	public Leads(RemoteWebDriver driver,ExtentTest test) 
	{
			this.driver = driver;
			this.test = test;
			System.out.println("Entered into Leads page");
			PageFactory.initElements(driver, this);		
			if(!verifyTitle("My Leads | opentaps CRM")) 
			{
				throw new RuntimeException();
			}		
		}
		
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement eleClickCreateLead;
		public CreateNewLead clickCreateLead()
		{
			click(eleClickCreateLead);
			return new CreateNewLead(driver, test);
		}
		
	
		/*@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleClickFindLeads;
		public FindLead clickFindLeads()
		{
			click(eleClickFindLeads);
			return new FindLead(driver, test);
		}*/
	
}
