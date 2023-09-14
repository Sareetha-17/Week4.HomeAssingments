package week4HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {

	public static void main(String[] args) {
//************Click and Confirm new Window Opens*******************************//
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Parent window Title
		String title = driver.getTitle();
		System.out.println("Parent Title is "+title);
		driver.findElement(By.id("j_idt88:new")).click();
		//current window 
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//to check the more window handles
		Set<String> Shandles = driver.getWindowHandles();
		List<String> Lhandles = new ArrayList<>(Shandles);
		driver.switchTo().window(Lhandles.get(1));
		
		//To get all window handles
		for(String each :Lhandles)
		{
			System.out.println("All Window handles "+each);
		}
		String title2 = driver.getTitle();
		System.out.println("Child Title is "+title2);
		
		if(!title.equals(title2))
		{
			System.out.println("New Window Opened");
		}
		else
		{
			System.out.println("Its in Parent Window....No new Window Opened!!!! ");
		}
		
		
		
		
		

	}

}
