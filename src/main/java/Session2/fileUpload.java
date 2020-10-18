package Session2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.LocalFileDetector;

import java.io.File;

import static java.lang.Thread.sleep;

public class fileUpload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        sleep(2000);


//        driver.setFileDetector(new LocalFileDetector());
//        File file = new File(  "C:\\Users\\VenD\\IdeaProjects\\file");
//        String imagePath = file.getAbsolutePath();
//        //driver.setFileDetector(new LocalFileDetector());

        driver.findElement( By.id( "uploadfile_0" ) ).sendKeys( "C:\\Users\\VenD\\Desktop\\FileIpload.txt");
        driver.findElement( By.id( "terms" ) ).click();
        driver.findElement( By.id( "submitbutton" ) ).click();
        driver.quit();





    }

}
