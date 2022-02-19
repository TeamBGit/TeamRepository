package TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;


import Browser.Base;
import HomePage.Capture_Vitals;
import HomePage.Scheduling_Operation;
import Login.Login1;

public class TestCase_Mrs extends Base {
	public Login1 lp;
	
	public TestCase_Mrs() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		lp=new Login1();
	}

	@BeforeSuite
	public void Launching_Browser()
	{
		initialisation();
	}
	@BeforeMethod
	public void BeforeTest() throws IOException {
		lp=new Login1();
		PageFactory.initElements(driver,Scheduling_Operation.class);
		PageFactory.initElements(driver,Capture_Vitals.class);
	}
	@Test
	public void Sign_in() throws Exception {
		lp.signin("Admin","Admin123");
		
		
	}
	
	@Test(dependsOnMethods = "Sign_in")
	public void HomePage() {
		String lable=Scheduling_Operation.lable.getText();
		String Expect="Logged in as Super User (admin) at Inpatient Ward.";
				
	    Assert.assertEquals(lable, Expect);
		System.out.println("The Lable is  :"+lable);
		
	}
	
	  @Test(dependsOnMethods = "HomePage") 
	  public void AppointmentScheduling() throws InterruptedException 
	  {
		  Scheduling_Operation.Appointment.click();
	  
	  Scheduling_Operation.Manageservicetype.click(); Scheduling_Operation.Delete.click();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", Scheduling_Operation.NO); 
	  }
	  
	  @Test(dependsOnMethods = "AppointmentScheduling")
	  public void CaptureVitals()
	  {    driver.navigate().to("https://demo.openmrs.org/openmrs/login.htm");
		  Capture_Vitals.CaptureTab.click();
		  Capture_Vitals.SearchTab.sendKeys("1002KL"+Keys.ENTER);
		  String Name=Capture_Vitals.patienttab.getText();
		  System.out.println(Name);
		  String Expected="Patient ID 1002KL";
		  Assert.assertEquals(Name, Expected);
		  
	  }
}

