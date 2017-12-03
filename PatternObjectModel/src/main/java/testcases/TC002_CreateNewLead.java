package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateNewLead;
import wdMethods.ProjectMethods;

public class TC002_CreateNewLead extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC002_CreateNewLead";
		testCaseName = "TC002_CreateNewLead";
		testDescription = "To Create the new lead details";
		category= "Smoke";
		authors	="Suren";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void leadCreation(String CName, String FName,String LName) {
		
        new CreateNewLead(driver, test)
		.enterCName(CName)
		.enterFirstName(FName)
		.enterLastName(LName);
        //.clickCreateLead();
		//.clickLogout();
	}

}
