package Test;

import java.util.List;

import javax.annotation.Generated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowColumn {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\watts\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.investing.com/commodities/brent-oil-historical-data";
		driver.get(baseUrl);
		
		WebElement table_id = driver.findElement(By.xpath("//table[@id='curr_table']/tbody"));

		List<WebElement> rows = table_id.findElements(By.tagName("tr"));

		for (WebElement row : rows){
					System.out.println(row.getAttribute("xpath"));
					
				    List<WebElement> col = row.findElements(By.tagName("td")); 
				    
				    System.out.println(col.get(0).getText());
		driver.close();
		}
	}

}
