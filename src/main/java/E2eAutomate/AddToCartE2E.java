package E2eAutomate;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddToCartE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] names= {"Brocolli","Cucumber","Carrot","Beetroot"};
		//List<String> namelist= Arrays.asList(names);
		
		List<WebElement> products= driver.findElements(By.cssSelector(".product-name"));
		List<WebElement> addcart=driver.findElements(By.cssSelector(".product-action"));
		int count=0;
		for(int i=0;i<products.size();i++)
		{
			for(int j=0;j<names.length;j++)
			{
			if(products.get(i).getText().split("-") [0].trim().equals(names[j]))
			{
				addcart.get(i).click();
				count++;
			}
			}
			if(count==names.length)
			{
				System.out.println(count);
				break;
			}
				
		}
	}

}
