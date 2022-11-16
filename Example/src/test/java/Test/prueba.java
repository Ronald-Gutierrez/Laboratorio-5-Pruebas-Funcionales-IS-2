package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import Example.test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

public class prueba {

	@Test
    public void tituloPrueba() {
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/");
        String title = driver.getTitle();
        assertEquals("Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science", title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println("Primera prueba realizada");
        driver.quit();
    }
	
	@Test
    public void botom() {
		
        WebDriver driver = new ChromeDriver();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]"));
        String value = message.getText();
        assertEquals("Calculate", value);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println("Segunda prueba realizada");
        driver.quit();
    }
	
	@Test
    public void texto() {
		
        WebDriver driver = new ChromeDriver();
        WebElement textBox = driver.findElement(By.id("cpar2"));

        textBox.sendKeys("50");
        String value = textBox.getText();
        assertEquals("50", value);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println("Segunda prueba realizada");
        driver.quit();
    }
	

	
}
