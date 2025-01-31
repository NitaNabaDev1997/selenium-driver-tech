package AutomateMechanics;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WIndowHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("chrome.switches","--disable-extensions");
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--incognito");
		/*
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 * options.merge(capabilities);
		 *///span[normalize-space()='Login']
		
		WebDriverManager.chromedriver().clearDriverCache();
		WebDriverManager.chromedriver().driverVersion("131.0.6778.205").setup();
		WebDriver driver= new ChromeDriver(options);
		Dimension dm= new Dimension(600,400);
		driver.manage().window().setSize(dm);
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println("Title: " + driver.getTitle());
		//click on multple window linktext
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		//click on click here text
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		//cssSelector
		driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		
		//xpath
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		//driver.switchTo().window(parentId);
		
		driver.switchTo().frame(0);
		
		//xpath
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
				
		

	}

}
