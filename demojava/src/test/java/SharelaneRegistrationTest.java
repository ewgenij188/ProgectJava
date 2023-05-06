import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharelaneRegistrationTest {
    WebDriver driver;

    @Test
    public void fifeDigitsZipCodeTest() {
        driver = new ChromeDriver();
        // Open main page https://sharelane.com/cgi-bin/register.py
        driver.get("https://sharelane.com/cgi-bin/register.py"); // alternative //driver.navigate().to(https://sharelane.com/cgi-bin/register.py);
        // Input fife digits to zip code
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        // Click continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        // Chek Register button
        WebElement registerButton = driver.findElement(By.cssSelector("[value='Register']"));
        assertTrue(registerButton.isDisplayed(), "Register button isn't displayed");
        
        
       
    }

}
