package week4HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		   driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		   String windowHandle = driver.getWindowHandle();
		   String title2 = driver.getTitle();
		   System.out.println("Title of parent Window is "+title2);
		   System.out.println("Parent Window   "+windowHandle);
	

        Thread.sleep(3000);
		   driver.findElement(By.xpath("(//tr//img)[1]")).click();
		   Thread.sleep(5000);
		   
		   // To Handle second window
		  Set<String> windowHandles1 = driver.getWindowHandles();
		  List<String> handles1 = new ArrayList<>(windowHandles1);
		  driver.switchTo().window(handles1.get(1));
		  driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x')]//a")).click();	
		  //switch back to parent window
		  driver.switchTo().window(windowHandle);
		  
		  //To handle second widget
		   Thread.sleep(5000);
		  driver.findElement(By.xpath("(//tr//img)[2]")).click();
		   Thread.sleep(5000);
		  Set<String> windowhandles2 = driver.getWindowHandles();
		  List<String> handles2 = new ArrayList<>(windowhandles2);
		  driver.switchTo().window(handles2.get(1));
		  driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x')]//a")).click();
		  
		  //switch back to parent window again
		  driver.switchTo().window(windowHandle);
		  driver.findElement(By.xpath("//a[text()='Merge']")).click();
		  
		  //Switching to Alert
		  
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  
		  //verify title of page
		  
		  String title = driver.getTitle();
		  System.out.println("Title of the current page is "+ title);
		  
		  String text = driver.findElement(By.xpath("//li[contains(text(),'Cannot merge')]")).getText();
		  
		  if(text.contains("Cannot merge"))
		  {
			  System.out.println("The elements is Present");
		  }
		  

	}

}
