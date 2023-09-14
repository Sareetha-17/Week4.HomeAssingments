package week4HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWithDelay {

	public static void main(String[] args) throws InterruptedException {
		
		//******************Wait for 2 new tabs to open************************//
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		String Ptitle = driver.getTitle();
		System.out.println("Parent Title is "+Ptitle);
		String pwindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window "+pwindowHandle);
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		Set<String> cwindowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<>(cwindowHandles);
		Thread.sleep(3000);
		for (String each : handles) {
		driver.switchTo().window(each);
		System.out.println(each);
	
		
	}
	
		
		

	}

}
