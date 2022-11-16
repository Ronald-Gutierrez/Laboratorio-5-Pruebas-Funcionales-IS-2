package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_selenium {
	 public static void main(String[] args) {
		   	//Set up web driver (chrome, firefox,...)
			//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
			   
			WebDriver driver = new ChromeDriver();
		      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		      //Launch website
		      driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
		      
		      //Maximize the browser
		      driver.manage().window().maximize();
		      //Close the Browser.
		      driver.close();
	 }
}
