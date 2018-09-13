package hi;

import java.net.URL;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class seleniumWebDriver {

	
	public static final String KEY = "KEY";
	  public static final String SECRET = "SECRET";
	  public static final String URL = "http://" + KEY + ":" + SECRET + "@hub.testingbot.com/wd/hub";

	  public static void main(String[] args) throws Exception {
		  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		  caps.setCapability(
		      InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		  //WebDriver driver123 = new InternetExplorerDriver(caps);
		//DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "IE");
		caps.setCapability("version", "11");
		caps.setCapability("platform", "WIN10");
		caps.setCapability("name", "My First Test");

		WebDriver driver123 = new RemoteWebDriver(new URL("http://www.google.com/"), caps);
		System.out.println();
		driver123.get("http://www.google.com/ncr");
		//WebElement element = driver123.findElement(By.name("q"));

		//element.sendKeys("TestingBot");
		//element.submit();

		System.out.println(driver123.getTitle());
		driver123.quit();

}
}
