package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{

		public FindLead(RemoteWebDriver driver,ExtentTest test) {
			this.driver = driver;
			this.test = test;
					
			PageFactory.initElements(driver, this);		
			if(!verifyTitle("Find Leads | opentaps CRM")) {
				throw new RuntimeException();
			}		
		}

		@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
		private WebElement elefirstName;
		public FindLead enterfName(String data)
		{
			type(elefirstName, data);
			System.out.println("Entered name successfully");
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
		private WebElement cFindLead;
		public FindLead btnFindLead()
		{
			click(cFindLead);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[6]")
		private WebElement linkClick;
		public ViewPage clickFirstLink()
		{
			click(linkClick);
			return new ViewPage(driver, test);
		}
		
		@FindBy(how=How.XPATH,using="(((//td [@class='x-btn-right'])[7])/preceding::button)[7]")
		private WebElement storeLeadId;
		static String lId;
		public FindLead getLeadId()
		{
			lId = storeLeadId.getText();
			System.out.println(lId);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="(((//td [@class='x-btn-right'])[7])/preceding::button)[7]")
		private WebElement enterStoredValue;
		public FindLead enterStoredLeadId()
		{
			type(enterStoredValue, lId);
			return this;
		}
}
