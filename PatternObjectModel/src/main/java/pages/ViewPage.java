package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewPage extends ProjectMethods{

	public ViewPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	/*
	 * @FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	 
	private WebElement eleClickCRMSFA;
	public MyHomePage clickCrmsfa() {
		click(eleClickCRMSFA);
		return new MyHomePage(driver, test);
		*/
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindbutton;
	public FindLead clickFindButton(){
		
		System.out.println("Entered into find lead page");
		click(eleFindbutton);
		return new FindLead(driver, test);
	}
	
	
	@FindBy(how=How.XPATH,using="(//a[@class='subMenuButton'])[3]")
	private WebElement eleEditbutton;
	public EditLead clickEditButton(){
		
		click(eleEditbutton);
		System.out.println("Clicked Edit button");
		return new EditLead(driver,test);
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eleDelbutton;
	public MyLeads clickDelButton(){
		click(eleDelbutton);
		System.out.println("Clicked Delete button");
		return new MyLeads(driver,test);
	}
	
	}

