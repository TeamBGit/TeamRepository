import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement logo= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		System.out.println(logo.isDisplayed());
		
	}

}
