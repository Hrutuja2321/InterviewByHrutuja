package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getall_selected_optiond 
{

	
	public static void main(String[] args) throws InterruptedException
	{
		

		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation2\\driver path\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		drive.get("file:///E:/htmlfiles/Country.html");
		 WebElement allopt =  drive.findElement(By.xpath("//*[@id=\"1234\"]"));
		 Select s= new Select( allopt);
		List<WebElement> options = s.getAllSelectedOptions();
		System.out.println(options);
		
		for(WebElement s2:options)
		{
			System.out.println(s2.getText());
		}
		 
	}
}
