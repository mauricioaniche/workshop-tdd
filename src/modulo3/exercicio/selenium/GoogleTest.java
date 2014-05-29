package modulo3.exercicio.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	@Test
	public void deveBuscarAlgoNoGoogle() {
		WebDriver driver = new FirefoxDriver();
		// abra o google
        driver.get("http://www.google.com");

        // Acha o elemento pelo nome
        WebElement element = driver.findElement(By.name("q"));

        // preencha com ...
        element.sendKeys("SPFC");

        // submete
        element.submit();

        // titulo
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.close();
	}
}
