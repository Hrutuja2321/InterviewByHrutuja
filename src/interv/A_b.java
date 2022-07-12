package interv;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_b 
{

	
	public static void main(String[] args) throws InterruptedException, FindFailed 
	
	{
	
		
       System.setProperty("webdriver.chrome.driver", "E:\\Automation2\\driver path\\chromedriver.exe");
              

		WebDriver drive= new ChromeDriver();
		
		System.out.println("");
		
		drive.get("https://nichethyself.com/tourism/home.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		drive.findElement(By.xpath("//a[@target='_blank']")).click();
		
	Set<String> an = drive.getWindowHandles();
	ArrayList<String> a1= new ArrayList<String>(an);
	
	
	drive.switchTo().window(a1.get(1));
	
	WebElement stay = drive.findElement(By.xpath("(//select[@class='form-control'])[1]"));
	Select s1= new Select(stay);
	s1.selectByIndex(2);
	
	drive.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	
	drive.findElement(By.xpath("//button[@class='link']")).click();
	
	Set<String> id = drive.getWindowHandles();
	ArrayList<String> a2= new ArrayList<String>(id);
	
	drive.switchTo().window(a2.get(2));
	
	
	
	drive.findElement(By.xpath("//span[@class='glyphicon glyphicon-search']")).click();
	
	
Alert alt=	drive.switchTo().alert();

Thread.sleep(1000);

Screen sc=new Screen();

Pattern p=new Pattern("E:\\task1.PNG") ;

sc.type(p, "Vaijapur") ;


Thread.sleep(1000);

alt.accept();
	
	}
}
