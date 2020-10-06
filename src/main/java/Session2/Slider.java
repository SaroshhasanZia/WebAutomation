package Session2;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

public class Slider {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "externalFiles");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
        driver.manage().window().maximize();

      WebElement slider =  driver.findElement( By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/input[1]" ) );
        Actions act = new Actions( driver );
        act.clickAndHold(slider).moveByOffset( 30,0 ).build().perform();







        sleep(5000);
        driver.quit();
        System.exit( 0 );

    }

}
