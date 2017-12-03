package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateNewLead;
import pages.FindLead;
import pages.LoginPage;
import pages.ViewPage;
import wdMethods.ProjectMethods;

public class CreateLead_Testcase extends ProjectMethods {
			@BeforeClass
		public void setData() {
			dataSheetName = "TC002_CreateNewLead";
			testCaseName = "TestCase002";
			testDescription = "To create a leads";
			category= "Smoke";
			authors	="surendran";
			browserName ="chrome";
		}
		
			@Test(dataProvider="fetchData")
			public void leadCreation(String CName, String FName,String LName) {
				
				new LoginPage(driver, test)
				.enterUserName()
				.enterPassword()
				.clickLogin()
				.clickCrmsfa()
				.clickLeads()
			     .clickCreateLead();
				
		        new CreateNewLead(driver, test)
				.enterCName(CName)
				.enterFirstName(FName)
				.enterLastName(LName)
				.createLeadButton();
				
		        
		        new ViewPage(driver, test)
		        .clickFindButton();
		        
		        new FindLead(driver, test)
		        .enterfName(FName)
		        .btnFindLead();	        
		       
			}

}
