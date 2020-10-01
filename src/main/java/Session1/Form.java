package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;


public class Form {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        driver.manage().window().maximize();

//        sleep(5000);
//        driver.findElement(By.id("at-cv-lightbox-close")).click();


        driver.findElement(By.name("first_name")).sendKeys("firstnme");
        driver.findElement(By.name("last_name")).sendKeys("lastname");
        driver.findElement(By.name("email")).sendKeys("spider@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("(92)3336401111");
        driver.findElement(By.name("address")).sendKeys("my home address");
        driver.findElement(By.name("city")).sendKeys("My city");

        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByVisibleText("California");


        driver.findElement(By.name("zip")).sendKeys("86400");

        driver.findElement(By.name("website")).sendKeys("https://www.google.com");

        List<WebElement> radiobutton = driver.findElements(By.cssSelector("input[type='radio']"));

        radiobutton.get(1).click();







        sleep(5000);


        driver.quit();



    }










}
