package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

		public MyLeads(RemoteWebDriver driver,ExtentTest test) {
			this.driver = driver;
			this.test = test;
			
			PageFactory.initElements(driver, this);		
			if(!verifyTitle("My Leads | opentaps CRM")) {
				throw new RuntimeException();
			}	
	}

		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleFindbutton;
		public FindLead clickFindButton(){
			
			System.out.println("Entered into Find Leads page");
			click(eleFindbutton);
			return new FindLead(driver, test);
		}
		
		
		
		
}
