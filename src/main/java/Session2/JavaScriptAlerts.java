package Session2;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class JavaScriptAlerts {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "externalFiles");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();


        driver.findElement( By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]" ) ).click();
        driver.switchTo().alert().accept();

        driver.findElement( By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/button[1]" ) ).click();
        driver.switchTo().alert().dismiss();
        String text = driver.findElement( By.id( "confirm-demo" ) ).getText();
        Assert.assertEquals( "You pressed Cancel!",text);

       WebElement Button = driver.findElement( By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]" ) );
       Button.click();
        driver.switchTo().alert().sendKeys( "hello world" );
        driver.switchTo().alert().accept();






        sleep(5000);
        driver.quit();
        System.exit( 0 );

    }

}
