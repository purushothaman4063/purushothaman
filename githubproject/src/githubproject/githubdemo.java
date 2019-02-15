package githubproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class githubdemo {
	public WebDriver dr;

	@Test
	public void homepage()
	{
		System.setProperty("webdriver.chrome.driver","G:/javaselenium/Drivers/chromedriver_win32/chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
	}
	
	@Test(dependsOnMethods="homepage")
	public void Login()
	{
		dr.findElement(By.id("email")).sendKeys("text");
		dr.findElement(By.id("pass")).sendKeys("qwerty");
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
	
	}
}
