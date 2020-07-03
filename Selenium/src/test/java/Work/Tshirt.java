package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tshirt extends Test1
{
	@Test
    public void Tshirt() throws InterruptedException{
		
	Thread.sleep(2000);
	WebElement A14 = driver.findElement(By.xpath("//a[@title='Women'][1]"));

	Actions action = new Actions(driver);
	action.moveToElement(A14).perform();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
	
	Thread.sleep(4000);
    

}}
