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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test1 {
	
	public static WebDriver driver;
    public static String baseUrl ="http://automationpractice.com/index.php";

    @BeforeSuite
	public void setup() {
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Gupta\\eclipse-workspace\\SeleniumTest\\lib\\chromedriver11\\chromedriver.exe");
	
		    driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
//	    @Test
//	    public void Test1() throws InterruptedException
//	    {
//	        WebElement Sign= driver.findElement(By.xpath("//div//*[@class='login'][1]"));
//	        Sign.click();
//	        Thread.sleep(4000);
//	       
//	        WebElement createaccount =driver.findElement(By.xpath("//input[contains(@id,'email_create')]"));
//	        createaccount.click();
//	        createaccount.sendKeys("saurabhgta04@gmail.com");
//	        
//	        driver.findElement(By.xpath("//input[contains(@id,'SubmitCreate']")).click();
//	        
//	        
//	        Thread.sleep(4000);
//	        
//	        driver.findElement(By.xpath("//input[contains(@id,'id_gender1')]")).click();
//	        
//	        WebElement A1 =driver.findElement(By.xpath("//input[contains(@id,'customer_firstname')]"));
//	        A1.click();
//	        A1.clear();
//	        A1.sendKeys("Ram");
//	        
//	        WebElement A2 =driver.findElement(By.xpath("//input[contains(@id,'customer_lastname')]"));
//	        A2.click();
//	        A2.clear();
//	        A2.sendKeys("Sham");
//	        
//	        WebElement A3 =driver.findElement(By.xpath("//input[contains(@id,'passwd')]"));
//	        A3.click();
//	        A3.clear();
//	        A3.sendKeys("Trump@Modi");
//	        
//	        
//	        WebElement A4 =driver.findElement(By.xpath("//input[contains(@id,'firstname')]"));
//	        A4.click();
//	        A4.clear();
//	        A4.sendKeys("Ram");
//	        
//	        WebElement A5 =driver.findElement(By.xpath("//input[contains(@id,'lastname')]"));
//	        A5.click();
//	        A5.clear();
//	        A5.sendKeys("Sham");
//	        
//	        WebElement A6 =driver.findElement(By.xpath("//input[contains(@id,'address1')]"));
//	        A6.click();
//	        A6.clear();
//	        A6.sendKeys("Sham circle,T-123");
//	        
//	        
//	        
//	        WebElement A7 =driver.findElement(By.xpath("//input[contains(@id,'city')]"));
//	        A7.click();
//	        A7.clear();
//	        A7.sendKeys("Faridabad");
//	        
//	        
//	        WebElement A8 =driver.findElement(By.xpath("//input[contains(@id,'city')]"));
//	        A8.click();
//	        A8.clear();
//	        A8.sendKeys("Faridabad");
//	        
//	        
//	        Select dropdown = new Select(driver.findElement(By.xpath("//*[contains(@id,'id_state']")));  
//	        dropdown.selectByVisibleText("Florida");  
//	        Thread.sleep(2000);
//	        
//	        
//
//	        WebElement A9 =driver.findElement(By.xpath("//input[contains(@id,'postcode')]"));
//	        A9.click();
//	        A9.clear();
//	        A9.sendKeys("122010");
//	        
//	        
//	        
//	        WebElement A10 =driver.findElement(By.xpath("//input[contains(@id,'other')]"));
//	        A10.click();
//	        A10.clear();
//	        A10.sendKeys("TestScript");
//	        
//	        
//	        WebElement A11 =driver.findElement(By.xpath("//input[contains(@id,'phone_mobile')]"));
//	        A11.click();
//	        A11.clear();
//	        A11.sendKeys("9999888801");
//	        
//	        
//	        WebElement A12 =driver.findElement(By.xpath("//input[contains(@id,'alias')]"));
//	        A12.click();
//	        A12.clear();
//	        A12.sendKeys("Lakshman@gmail.com");
//	        
//
//	        WebElement A13 =driver.findElement(By.xpath("//input[contains(@id,'submitAccount')]"));
//	        A13.click();
//	        
//	        Thread.sleep(4000);
//
//
//	    }
//	        
//
//	        @Test
//	        public void Tshirt() throws InterruptedException{
//	        	WebElement A14 = driver.findElement(By.xpath("//a[@title='Women'][1]"));
//
//	        	Actions action = new Actions(driver);
//	        	action.moveToElement(A14).perform();
//	        	Thread.sleep(1000);
//	        	
//	        	driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
//	        	
//	        	Thread.sleep(4000);
//                
//      }
//	        @Test
//	        public void TshirtSelection() throws InterruptedException {
//	        	
//	        	{	WebElement Position = driver.findElement(By.xpath("(//*[@class='compare-form'])[1]"));
//					Point point = Position.getLocation();
//					System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
//					System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
//				
//	        	}
//
//	        	{
//					JavascriptExecutor jse = (JavascriptExecutor) driver;
//					jse.executeScript("window.scrollBy(0,850)");
//				
//	        	}
//	        	Thread.sleep(2000);
//	        	
//	        	Actions actions = new Actions(driver);
//	         	WebElement A15 = driver.findElement(By.xpath("(//*[@title='Faded Short Sleeve T-shirts'])[2]"));
//	         	actions.moveToElement(A15).perform();
//	         	System.out.println("Done Mouse hover on 'Product displyed'");
//	         	
//	         	Thread.sleep(2000);
//	         	driver.findElement(By.xpath("//span[text()='More']")).click();
//	         	
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				
//				driver.findElement(By.xpath("//*[@class='icon-plus'][1]")).click();
//
//				Select dropdown1 = new Select(driver.findElement(By.xpath("//div//select[contains(@id,'group_1')][1]")));  
//		        dropdown1.selectByVisibleText("L");  
//			    Thread.sleep(2000);
//			    
//			    driver.findElement(By.xpath("//*[contains(@id,'color_14')][1]")).click();
//			    Thread.sleep(2000);
//
//			    driver.findElement(By.xpath("//span[text()='Add to cart'][1]")).click();
//			    Thread.sleep(2000);
//
//			    driver.findElement(By.xpath("//*[@title='Proceed to checkout'][1]")).click();
//			    
//			    
//			   //******** payment part is left 
//	        }

  @AfterSuite
      public void Logout()
      {
              driver.quit();  
      }

}