package Session1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;


public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
// Adding Iframe:

        driver.switchTo().frame( driver.findElement(By.className( "demo-frame" )) );
// Actions object
        //src
        WebElement src = driver.findElement(By.id("draggable"));

        //dest
        WebElement des = driver.findElement(By.id("droppable"));


        Actions act = new Actions(driver);
        act.dragAndDrop(src,des).build().perform();



       // printing the dropped output
        System.out.println(des.getText());




        sleep(2000);

        driver.quit();








    }

}
