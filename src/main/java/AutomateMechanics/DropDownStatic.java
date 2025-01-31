package AutomateMechanics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.Select;

public class DropDownStatic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		  WebElement dropdown =
		  driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")); Select
		  select=new Select(dropdown); select.selectByIndex(3);
		  select.selectByValue("AED");
		  
		  driver.findElement(By.id("divpaxinfo")).click(); for(int i=1;i<=5;i++)
		  driver.findElement(By.id("hrefIncAdt")).click();
		  
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  driver.findElement(By.className("buttonN")).click();
		 
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("ko");

		driver.findElement(By.xpath("//a[@text='Kolkata (CCU)']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("h");
		//WebElement destination =driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Hyderabad (HYD)']"));
		//destination.click();
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		List<WebElement> places = driver.findElements(By.cssSelector(".dropdownDiv li"));
		for(WebElement place:places)
		{
			if(place.getText().equalsIgnoreCase("Hyderabad (HYD)"))
			{
				place.click();
				break;
			}
		}
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//li[contains(@class,'city_selected')]//a[@value='HYD'][normalize-space()='Hyderabad (HYD)']
		//driver.findElement(By.linkText("Hyderabad (HYD)")).click();

		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.close();
	}

}
