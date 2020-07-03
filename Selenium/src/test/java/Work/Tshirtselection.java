package Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tshirtselection extends Test1
{

	@Test
    public void TshirtSelection() throws InterruptedException {
	
	{	WebElement Position = driver.findElement(By.xpath("(//*[@class='compare-form'])[1]"));
		Point point = Position.getLocation();
		System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
		System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
	
	}

	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,850)");
	
	}
	Thread.sleep(2000);
	
	Actions actions = new Actions(driver);
 	WebElement A15 = driver.findElement(By.xpath("(//*[@title='Faded Short Sleeve T-shirts'])[2]"));
 	actions.moveToElement(A15).perform();
 	System.out.println("Done Mouse hover on 'Product displyed'");
 	
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("//span[text()='More']")).click();
 	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@class='icon-plus'][1]")).click();

	Select dropdown1 = new Select(driver.findElement(By.xpath("//div//select[contains(@id,'group_1')][1]")));  
    dropdown1.selectByVisibleText("L");  
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[contains(@id,'color_14')][1]")).click();
    Thread.sleep(2000);

    driver.findElement(By.xpath("//span[text()='Add to cart'][1]")).click();
    Thread.sleep(2000);

    driver.findElement(By.xpath("//*[@title='Proceed to checkout'][1]")).click();
    
    
   //******** payment part is left 
}

}
