package Session3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;


public class JavaScriptScroll {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://webkul.com/blog/how-to-scroll-in-a-specific-element-using-selenium-webdriver/");
        driver.manage().window().maximize();

//        sleep(5000);
//        driver.findElement(By.id("at-cv-lightbox-close")).click();


        JavascriptExecutor js = (JavascriptExecutor)
                driver.executeScript("arguments[0].scrollIntoView();",driver.findElement( By.className( "crayon-pre" ) ));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath( "/html[1]/body[1]/div[1]/article[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[30]/span[18]" )));



        sleep(1000  );





        driver.quit();
        System.exit( 200 );



    }










}
