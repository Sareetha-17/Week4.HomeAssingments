package week4HomeAssignments;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonURL {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		 
		//Get the Price of the product
		String price = text.replaceAll(",", "");
		System.out.println("Price of first Product is " +price);
		
		//Print the number of customer ratings for the first displayed product
		 WebElement findElement = driver.findElement(By.xpath("//a//span[@class='a-size-base s-underline-text']"));
		 String text2 = findElement.getText();
		 System.out.println("Rating is "+text2);
		 
		 //Click the first text link of the first image
		 WebElement findElement2 = driver.findElement(By.xpath("//a//span[@class='a-size-medium a-color-base a-text-normal']"));
		 findElement2.click();
		 Thread.sleep(3000);
		 
		 // Moving to Next window
		 Set<String> str = driver.getWindowHandles();
		 List<String> handles = new ArrayList<>(str);
		 driver.switchTo().window(handles.get(1));
		 	Thread.sleep(3000);
	
		 //To take Screenshot of the product Using Robot class
	//	 Robot rob = new Robot();
	//	 Rectangle scr = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	//	 BufferedImage buf = rob.createScreenCapture(scr);
	//	 Thread.sleep(3000);
	//	 ImageIO.write(buf, "jpg", new File("D:\\Testleaf Selenium\\Week4 notes\\Sample.JPG"));
	//	 System.out.println("A full screenshot saved in the Located path!");
		 
		//To take Screenshot of the product Using File 
		 File Src = driver.getScreenshotAs(OutputType.FILE);
		 File des = new File("./SampleScreenshots/img.png");
		 FileHandler.copy(Src, des);
		 System.out.println("Screenshot saved in the given path!!");
		 
		
		
		
		 // Click 'Add to Cart' button
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 
		//Get the cart subtotal and verify if it is correct.
		 String subtotal = driver.findElement(By.xpath("//b[text()='Cart subtotal']/following::span")).getText();
		 String replaceAll = subtotal.replaceAll("[^a-zA-Z0-9.]", "");
	
		System.out.println(replaceAll);
		
		//Truncating the decimal values
	
			float parseFloat = Float.parseFloat(replaceAll);
			int round = Math.round(parseFloat);
			int round2 = Math.round(round);
			String roundoff=Integer.toString(round2);
		
		
			System.out.println(roundoff);
		
		 
			if(price.equals(roundoff))
			{
			 System.out.println("Price and subtotal are same");
			}
			else
			{
			System.out.println("Not Equal");
			}	 
		
			driver.quit();
	
		

	}

}
