package Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Summary extends Test1
{

	@SuppressWarnings("unlikely-arg-type")
	@Test
    public void shopping() throws InterruptedException {
		
		Thread.sleep(3000);
//		{	WebElement Position3 = driver.findElement(By.xpath("(//*[@title='Proceed to checkout'])[2]"));
//		Point point = Position3.getLocation();
//		System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
//		System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
//	
//	}

	{
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,850)");
	
	}
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	Thread.sleep(2000);
	{
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,850)");
	
	}
	Thread.sleep(2000);

	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("(//*[@id='cgv'])[1]")).click();
	Thread.sleep(2000);
	{
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,850)");
	
	}
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();

	Thread.sleep(4000);
	{
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,850)");
	
	}
	
	driver.findElement(By.xpath("(//*[@title='Pay by bank wire'])[1]")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(4000);

	WebElement A20 = driver.findElement(By.xpath("//p//*[text()='Your order on My Store is complete.']"));

	System.out.println(A20.getText());
	
	if(A20.getText().equals("Your order on My Store is complete."))
	{
		System.out.println("Order status: Your order is confirmed");
	}
	else {
		System.out.println("Order status: Your order is not confirmed");
	}
		
	Thread.sleep(3000);
	
	}
	}