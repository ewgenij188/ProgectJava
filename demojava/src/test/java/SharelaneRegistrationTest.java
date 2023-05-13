import static org.junit.jupiter.api.Assertions.assertTrue;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static constans.PageUrls.*;

public class SharelaneRegistrationTest extends BaseTest {
    WebDriver driver;
    

    @Test
    public void fifeDigitsZipCodeTest() {
        
        // Open main page https://sharelane.com/cgi-bin/register.py
        driver.get(SHARELANE_REGISTER); // alternative //driver.navigate().to(https://sharelane.com/cgi-bin/register.py);
        // Input fife digits to zip code
        String title = driver.getTitle();
        String url = driver.getCurrentUrl(); 
        String pageId = driver.getWindowHandle();
        Set<String> pageIds = driver.getWindowHandles();
        driver.navigate().refresh(); //update page
    
        driver.findElement(By.name("zip_code")).sendKeys("12345"); 
       // driver.navigate().to("https://bamper.by/zchbu/zapchast_steklo-lobovoe/marka_tesla/model_model3/god_2019-2023/"); //go to next website
        // Click continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        // Chek Register button
        List<WebElement> regostrationButton = driver.findElements(By.cssSelector("[value='Register']"));
        WebElement registerButton = driver.findElement(By.cssSelector("[value='Register']"));
        assertTrue(registerButton.isDisplayed(), "Register button isn't displayed");
        System.out.println(title);
        System.out.println(url);
        System.out.println(pageId);
        System.out.println(regostrationButton);

        driver.quit();

    }

    @Test
    public void cookieDemo(){

        driver.get(ONLINER_PAGE);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("");
       // driver.manage().getCookieNamed();
       driver.quit();
    }

    @Test
    public void loginSwagTest(){
        driver.get(SAUSEDEMO);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();
        System.out.println("");
    }
}
 