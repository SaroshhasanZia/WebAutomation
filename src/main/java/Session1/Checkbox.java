package Session1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;


public class Checkbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
// Single check box
        driver.findElement(By.cssSelector("#isAgeSelected[value='']")).click();


// Assertation

        Assert.assertEquals( "Success - Check box is checked", driver.findElement( By.id( "txtAge" ) ).getText() );
        System.out.println( driver.findElement( By.id( "txtAge" ) ).getText() );

        //multiple checkboxes

        List<WebElement> options = driver.findElements( By.cssSelector("input[type='checkbox']") );
        options.get( 1 ).click();
        options.get( 2 ).click();


        sleep(2000);

//        driver.close();








    }

}
