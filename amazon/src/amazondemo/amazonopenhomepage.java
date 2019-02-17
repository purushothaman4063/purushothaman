package amazondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class amazonopenhomepage {
	public WebDriver dr;
public void amazon_homepage_open_function()
{
	System.setProperty("webdriver.chrome.driver","G:/javaselenium/Drivers/chromedriver_win32/chromedriver.exe");
	dr= new ChromeDriver();
	
	dr.get("http://www.amazon.com");

	dr.manage().window().maximize();
}

    public void validation_of_amazon_deparment_menu() {
    	
    	dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]")).click();
    	
    	//findoutthepagetitle
    			System.out.println("applicationtitle"+"    "+ dr.getTitle());
    			
    			Actions object=new Actions(dr);
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[contains(@class,'nav-text')][contains(text(),'Prime Video')]")).click();
    			
    			dr.findElement(By.xpath("//span[contains(@class,'nav-sprite nav-logo-base')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Music, CDs & Vinyl')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Digital Music')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Kindle Store')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Arts & Crafts')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Automotive')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//div[contains(@class,'nav-template nav-flyout-content nav-tpl-itemList')]//span[contains(@class,'nav-text')][contains(text(),'Baby')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Beauty & Personal Care')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//div[contains(@class,'nav-template nav-flyout-content nav-tpl-itemList')]//a[9]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Computers')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),\"Women's Fashion\")]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),\"Men's Fashion\")]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),\"Girls' Fashion\")]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),\"Boys' Fashion\")]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Health & Household')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Home & Kitchen')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Industrial & Scientific')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
                dr.findElement(By.xpath("//span[contains(text(),'Luggage')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Movies & Television')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Pet Supplies')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Software')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Sports & Outdoors')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
    			dr.findElement(By.xpath("//span[contains(text(),'Tools & Home Improvement')]")).click();
    			
    			object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
    			
                dr.findElement(By.xpath("//span[contains(text(),'Toys & Games')]")).click();
                
                object.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-shopall']//span[contains(@class,'nav-line-2')]"))).build().perform();
                
                dr.findElement(By.xpath("//span[contains(text(),'Video Games')]")).click();
    }
    

}
  
