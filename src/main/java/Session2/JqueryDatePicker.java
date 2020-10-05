package Session2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class JqueryDatePicker {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "externalFiles");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
        driver.manage().window().maximize();
//From
       driver.findElement( By.cssSelector( "#from" ) ).click();
        Select month = new Select( driver.findElement( By.className( "ui-datepicker-month" ) ) );
        month.selectByValue( "11" );

        //date:
        driver.findElement( By.xpath( "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[4]/td[7]" ) ).click();
//TO
        driver.findElement( By.cssSelector( "#to" ) ).click();
        Select monthto = new Select( driver.findElement( By.className( "ui-datepicker-month" ) ) );
        monthto.selectByValue( "11" );

        //date:
        driver.findElement( By.xpath( "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[5]/td[2]" ) ).click();







        sleep(2000);
        driver.quit();
        System.exit( 0 );

    }

}
