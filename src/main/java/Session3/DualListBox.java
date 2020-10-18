package Session3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;


public class DualListBox {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
        driver.manage().window().maximize();

//        sleep(5000);
//        driver.findElement(By.id("at-cv-lightbox-close")).click();
        WebElement box = driver.findElement(By.className( "pickListSelect" ));

        Select select = new Select( box) ;
        //select.getOptions().size();
        select.selectByVisibleText( "Sophia" );
        select.selectByVisibleText( "Manuela" );
        driver.findElement( By.className( "pAdd" ) ).click();
        int size = select.getOptions().size();
        System.out.println(size);





        sleep(1000  );





        driver.quit();
        System.exit( 200 );



    }










}
