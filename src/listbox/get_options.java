package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_options
{


	public static void main(String[] args) throws InterruptedException
	{
		

		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation2\\driver path\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		drive.get("http://facebook.com");
		
		
		drive.findElement(By.xpath("(//a[@role='button'])[2]")).click(); // click on new acc
	//	drive.manage().window().maximize();//
		
		WebElement year=drive.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s1=new Select(year);
		
	List<WebElement> alloptions = s1.getOptions();
	int size= alloptions.size();
	
	System.out.println(size);
	
	System.out.println();
	for(WebElement s2:alloptions)
	{
		System.out.println(s2.getText());
	}
	
	}
}
