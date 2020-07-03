package Work;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Login extends Test1{
	@Test
    public void Login() throws InterruptedException
    {
		Thread.sleep(4000);
      WebElement Sign= driver.findElement(By.xpath("//div//*[@class='login'][1]"));
      Sign.click();
      Thread.sleep(4000);

      
      WebElement emailaddress =driver.findElement(By.xpath("(//input[@id='email'])[1]"));
      emailaddress.click();
      emailaddress.clear();
      emailaddress.sendKeys("saurabhgta04@gmail.com");
        Thread.sleep(2000);
        
        

        WebElement Pwd =driver.findElement(By.xpath("//input[contains(@id,'passwd')]"));
        Pwd.click();
        Pwd.clear();
        Pwd.sendKeys("Trump@Modi");
          Thread.sleep(2000);
          
        driver.findElement(By.xpath("(//*[@id='SubmitLogin'])[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//a[@title='Home'])[1]")).click();
        Thread.sleep(2000);

        

		
//		Thread.sleep(4000);
//        WebElement Sign= driver.findElement(By.xpath("//div//*[@class='login'][1]"));
//        Sign.click();
//        Thread.sleep(4000);
//       
//        WebElement createaccount =driver.findElement(By.xpath("//input[contains(@id,'email_create')]"));
//        createaccount.click();
//        createaccount.sendKeys("saurabhgta04@gmail.com");
////        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("(//button[@name='SubmitCreate'])[1]")).click();
//        
////        WebDriverWait wait = new WebDriverWait(driver, 40);
////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'id_gender1']")));
//
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//input[contains(@id,'id_gender1')]")).click();
//        
//        WebElement A1 =driver.findElement(By.xpath("//input[contains(@id,'customer_firstname')]"));
//        A1.click();
//        A1.clear();
//        A1.sendKeys("Ram");
//        
//        WebElement A2 =driver.findElement(By.xpath("//input[contains(@id,'customer_lastname')]"));
//        A2.click();
//        A2.clear();
//        A2.sendKeys("Sham");
//        
//        WebElement A3 =driver.findElement(By.xpath("//input[contains(@id,'passwd')]"));
//        A3.click();
//        A3.clear();
//        A3.sendKeys("Trump@Modi");
//        
//        {	WebElement Position1 = driver.findElement(By.xpath("//*[@id='firstname'][1]"));
//		Point point = Position1.getLocation();
//		System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
//		System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
//	
//	}
//
//	{
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,850)");
//	
//	}
//            
//        
//        
//        WebElement A4 =driver.findElement(By.xpath("//input[contains(@id,'firstname')]"));
//        A4.click();
//        A4.clear();
//        A4.sendKeys("Ram");
//        
//        WebElement A5 =driver.findElement(By.xpath("//input[contains(@id,'lastname')]"));
//        A5.click();
//        A5.clear();
//        A5.sendKeys("Sham");
//         
//        
//        WebElement A6 =driver.findElement(By.xpath("//input[contains(@id,'address1')]"));
//        A6.click();
//        A6.clear();
//        A6.sendKeys("Sham circle,T-123");
//        
//        
//        
//        WebElement A7 =driver.findElement(By.xpath("//input[contains(@id,'city')]"));
//        A7.click();
//        A7.clear();
//        A7.sendKeys("Faridabad");
//        
//        
//        {	WebElement Position2 = driver.findElement(By.xpath("//*[@id='postcode'][1]"));
//     		Point point = Position2.getLocation();
//     		System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
//     		System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
//     	
//     	}
//
//     	{
//     		JavascriptExecutor jse = (JavascriptExecutor) driver;
//     		jse.executeScript("window.scrollBy(0,850)");
//     	
//     	}
//                    
//        
//        Select dropdown = new Select(driver.findElement(By.xpath("//*[contains(@id,'id_state']")));  
//        dropdown.selectByIndex(9);
//        Thread.sleep(2000);
//        
//        
//
//        WebElement A9 =driver.findElement(By.xpath("//input[contains(@id,'postcode')]"));
//        A9.click();
//        A9.clear();
//        A9.sendKeys("122010");
//        
//        
//        
//        WebElement A10 =driver.findElement(By.xpath("//input[contains(@id,'other')]"));
//        A10.click();
//        A10.clear();
//        A10.sendKeys("TestScript");
//        
//        
//        WebElement A11 =driver.findElement(By.xpath("//input[contains(@id,'phone_mobile')]"));
//        A11.click();
//        A11.clear();
//        A11.sendKeys("9999888801");
//        
//        
//        WebElement A12 =driver.findElement(By.xpath("//input[contains(@id,'alias')]"));
//        A12.click();
//        A12.clear();
//        A12.sendKeys("Lakshman@gmail.com");
//        
//
//        WebElement A13 =driver.findElement(By.xpath("//input[contains(@id,'submitAccount')]"));
//        A13.click();
//        
//        Thread.sleep(4000);


    }
}