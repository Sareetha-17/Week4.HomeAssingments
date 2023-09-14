package week4HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class CloseTheAllWindow {

	public static void main(String[] args) throws InterruptedException {
		
//***************************Close all windows except Primary*************//
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhml;jsessionid=node0qu4qenq0z5t6lrf2fn3ifgsp480411.node0");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		String PwindowHandle = driver.getWindowHandle();
		System.out.println(PwindowHandle);
		System.out.println("Parent window Title "+driver.getTitle());
		
		Set<String> CwindowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<>(CwindowHandles);
	
		for (String each : handles) {
			
			System.out.println(each);
		
		if(!PwindowHandle.equals(each))
		{
			driver.switchTo().window(each);
			driver.close();
			
		}
		

		}
		System.out.println("All child window closed");
		
		
		}

}
