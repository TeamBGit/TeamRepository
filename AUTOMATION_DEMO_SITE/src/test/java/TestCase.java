import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Browser.Base;
import Login.Login1;
import Login.RecruimentFn;


public class TestCase extends Base {
	public Login1 lp;

	public TestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@BeforeSuite
public void SetUp() throws IOException {
	
	initialisation();	
}


@BeforeMethod
public void BeforeTest() throws IOException {
	lp=new Login1();
	PageFactory.initElements(driver,RecruimentFn.class);
}



	@Test
	public void Test() throws Exception {
		driver.navigate().refresh();
		lp.signin("Admin","admin123");	
	}
	@Test(enabled = false)
	public void Negative_Test() throws Exception
	{
		
		lp.signin("adsf","dkcgg");
	}
@Test(dependsOnMethods ="Test")
public void vacancy()
{
	RecruimentFn. RequirmentTab.click();
	RecruimentFn.vacancytab.click();
	
    Select s=new Select(RecruimentFn.jobtitle);
    s.selectByVisibleText("QA Engineer");
    RecruimentFn.searchbtn.click();
    System.out.println(RecruimentFn.Records.getText());	
}

@Test(dependsOnMethods = "vacancy")
public void addvacancy() {
	
	RecruimentFn.addbtn.click();
	
	Select jobtitle=new Select(RecruimentFn.job_req);
	jobtitle.selectByVisibleText("QA Engineer");
	
	RecruimentFn.vacant.sendKeys("Automation");
	RecruimentFn.hiringmanger.sendKeys("Varmaa Rajeshh"+Keys.ENTER);
	
	RecruimentFn.no_position.sendKeys("2");
	RecruimentFn.decription.sendKeys("SeleniumWithJava");
	RecruimentFn.status.click();
	RecruimentFn.Rss.click();
	
	RecruimentFn.Savebtn.click();
	
	
	System.out.println("vacancy created successfully");
	
	RecruimentFn.backbtn.click();	
}
@Test(dependsOnMethods = "addvacancy")
public void candidate() {
	RecruimentFn.Candidatestab.click();
	RecruimentFn.Addbtn.click();
	RecruimentFn.firstName.sendKeys("Deva");
	RecruimentFn.middleName.sendKeys("Raj");
	RecruimentFn.lastName.sendKeys("M");
	RecruimentFn.email.sendKeys("devaraj33@gmail.com");
	RecruimentFn.contactNo.sendKeys("9337588941");
	Select job=new Select(RecruimentFn.demo);
	job.selectByVisibleText("Automation");
	RecruimentFn.resume.sendKeys("C:\\Users\\rajaganapathy.m\\Desktop\\Resume.txt");
	RecruimentFn.keyWords.sendKeys("Automation Testing ,Selenium With Java");
	RecruimentFn.comment.sendKeys("Done Software Testing");
	RecruimentFn.savebtn.click();
	RecruimentFn.backbtn.click();
     }
}
