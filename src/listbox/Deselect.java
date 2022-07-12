package listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect 
{

	
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Automation2\\driver path\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		drive.get("https://www.facebook.com//");
		

		drive.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		drive.manage().window().maximize();
		
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		drive.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hrutuja");
		drive.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Thombare");
		drive.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7744@gmail.com");
		
		WebElement day=drive.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s=new Select(day);
		s.deselectByIndex(11);
		
		WebElement month=drive.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s1=new Select(month);
		s1.deselectByValue("6");
		
		WebElement year=drive.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s2=new Select(year);
		s2.deselectByVisibleText("2022");
		
	}
}
