package Test;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	@Test
    public void TitleAndElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);

        driver.quit();
    }
	
	@Test
	public void radioPruebaSelect() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement check1 = driver.findElement(By.id("my-check-1"));
        WebElement check2 = driver.findElement(By.id("my-check-2"));
        assertTrue(check1.isSelected());
        assertFalse(check2.isSelected());

        driver.quit();
	}
	
	@Test
	public void EntradaText() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement textBox = driver.findElement(By.name("my-text"));
        textBox.sendKeys("Esta es una entrada de prueba");
        
        String valor = textBox.getAttribute("value");

        assertEquals("Esta es una entrada de prueba", valor);
        driver.quit();
	}

}
