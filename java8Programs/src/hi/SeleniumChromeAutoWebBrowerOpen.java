package hi;

import java.util.Arrays;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumChromeAutoWebBrowerOpen {
	

	public static String driverPath = "C:\\51639815 - databackup\\";
	 public static WebDriver driver;
  public static void main(String[] args) throws InterruptedException {
 
	  
	  for(boolean b=true;;){
		  System.out.println(new Date());
	  
	  System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shyamsunder.p\\Desktop\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  ChromeOptions cOptions = new ChromeOptions();
	  cOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
	  cOptions.addArguments("disable-infobars");
	  driver.get("https://www.naukri.com/nlogin/login");
	  Thread.sleep(5 * 1000);
	 WebElement name= driver.findElement(By.id("usernameField"));
	  
	  name.sendKeys("pssundaar@gmail.com");
	  
 WebElement pass= driver.findElement(By.id("passwordField"));
	  
	  pass.sendKeys("pssundaar@18");//  waves-effect waves-light btn-large btn-block btn-bold blue-btn
	 
	  
	  driver.findElement(By.cssSelector(".waves-effect.waves-light.btn-large.btn-block.btn-bold.blue-btn")).click();
	  
	  
	// Thread.sleep(3 * 1000);
	  driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
	  
	  
	  //<input type="file" id="attachCV" class="fileUpload waves-effect waves-light btn-large">
	  
	  WebElement w=driver.findElement(By.id("attachCV"));
	  w.click();
	 // resumeClick.click();
	 // WebElement resumeClick= driver.findElement(By.id("attachCV"));
	 // resumeClick.sendKeys("C:\\Users\\shyamsunder.p\\Desktop\\Aug5.docx");
	 // driver.findElement(By.cssSelector(".fileUpload.waves-effect.waves-light.btn-large")).click();
      System.out.println("hi");
      //driver.close();
	  
	  }
	 

    }

}	