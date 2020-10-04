package Session2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;

public class FileDownload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "externalFiles");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
        driver.manage().window().maximize();

        driver.findElement( By.id(  "textbox") ).sendKeys( "This is a test, a test is a test for testing the test" +
                "and tests are for testing only" );
        driver.findElement( By.id( "create" ) ).click();

        driver.findElement( By.id( "link-to-download" ) ).click();
        sleep(2000);
        driver.quit();
        System.exit( 0 );

    }

}
