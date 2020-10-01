package Session1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;


public class FormFill {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenD\\Desktop\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/account/create?specId=yidReg");
//        WebElement element = driver.findElement(By.cssSelector("input[type=\"text\"][name=\"email\"]"));
//        element.sendKeys("sarosh_26@yahoo.com");
//        driver.findElement(By.cssSelector("input[type='password'][name='pass']")).sendKeys("Xtrz6190");
//        driver.findElement(By.cssSelector("button[name='login']")).click();
//
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("seliniumtest123");
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("for_automation");
        driver.findElement(By.id("usernamereg-yid")).sendKeys("seliniumtest_11123");
        driver.findElement(By.id("usernamereg-password")).sendKeys("abcd^%&123");

        Select shortCountryCode = new Select(driver.findElement(By.name("shortCountryCode")));
        shortCountryCode.selectByValue("PK");

        Select month = new Select(driver.findElement(By.id("usernamereg-month")));
        month.selectByValue("2");
        driver.findElement(By.id("usernamereg-day")).sendKeys("26");
        driver.findElement(By.id("usernamereg-year")).sendKeys("1994");


        driver.findElement(By.id("usernamereg-phone")).sendKeys("3452171546");
        driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("male");

        sleep(2000);

        driver.findElement(By.id("reg-submit-button")).click();









    }







}
