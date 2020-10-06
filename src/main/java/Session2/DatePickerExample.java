package Session2;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DatePickerExample {

    static void datefinder(String date){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe" );
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true" );
        ChromeDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html" );
        driver.manage().window().maximize();

        driver.findElement( By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]" ) ).click();

        List<WebElement> table = driver.findElements( By.xpath( "/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr" ) );
        for (WebElement row : table) {

            List<WebElement> cells = row.findElements( By.xpath( "/ td" ) );
            for (WebElement cell : cells) {
                if (cell.getText().equals( date )) {
                    driver.findElement( By.xpath( "/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]" ) ).click();
                    break;
                }

            }
        }
       // driver.quit();
       // System.exit( 0 );
//    List<WebElement> tableRows = table.findElements( By.xpath( "//tr" ) );
//    for (WebElement row : tableRows) {
//        List<WebElement> cells = row.findElements( By.xpath( "td" ) );
//
//        for (WebElement cell : cells) {
//            if (cell.getText().equals( date )) {
//                driver.findElement( By.linkText( date ) ).click();
//            }
//        }
//    }


    }

    public static void main(String[] args) {
        datefinder( "1" );
    }

}

