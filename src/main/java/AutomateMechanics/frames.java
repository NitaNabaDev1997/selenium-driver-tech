package AutomateMechanics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
