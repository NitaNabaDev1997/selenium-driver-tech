package AutomateMechanics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.*;
public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//select first checkbox
		WebElement first_checkbox= driver.findElement(By.id("checkBoxOption1"));
		first_checkbox.click();
		
		//verify if selected
		System.out.println(first_checkbox.isSelected());
		
		//unselect first checkbox
		first_checkbox.click();
		
		//verify if unselected
		System.out.println(first_checkbox.isSelected());
		
		//Count of number of check boxes present in the page
		
		List<WebElement> checkboxs= driver.findElements(By.cssSelector("#checkbox-example label"));
		
		System.out.print("No of checkboxes"+checkboxs.size());
	}

}
