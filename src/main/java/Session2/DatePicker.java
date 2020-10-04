package Session2;


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

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "externalFiles");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
        driver.manage().window().maximize();

        driver.findElement( By.cssSelector( "div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) " +
                "div.row:nth-child(2) div.panel.panel-default div.panel-body:nth-child(4) div.col-xs-4 div.input-group.date:nth-child(2) " +
                "> span.input-group-addon" ) ).click();

       driver.findElement( By.xpath( "/html[1]/body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]" ) ).click();
       driver.findElement( By.xpath( "/html[1]/body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[2]" ) ).click();
       driver.findElement(By.xpath( "/html[1]/body[1]/div[3]/div[3]/table[1]/thead[1]/tr[2]/th[1]" ) ).click();

sleep( 2000 );
  //Year:
        WebElement pathofyear = driver.findElement(By.xpath( "/html[1]/body[1]/div[3]/div[3]/table[1]/tbody[1]/tr[1]/td[1]" ));
        List<WebElement> year = pathofyear.findElements( By.tagName( "span" ) );
        year.get( 6 ).click();

sleep( 1000 );
  //Month:
        WebElement pathofMonth = driver.findElement(By.xpath( "/html[1]/body[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[1]" ));
        List<WebElement> month = pathofMonth.findElements( By.tagName( "span" ) );
        month.get(11).click();
        sleep( 1000 );

  // Date:
        WebElement path = driver.findElementByXPath( "/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]" );
        List <WebElement> date = path.findElements( By.tagName( "td" ) );
        date.get(26).click();




        sleep(2000);
        driver.quit();
        System.exit( 0 );

    }

}
