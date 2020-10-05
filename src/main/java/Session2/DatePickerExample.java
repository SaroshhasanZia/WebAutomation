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

public class DatePickerExample {


    @Test
    public void jQueryCalendarExample() {
        driver.navigate().to(jQueryURL);
        WebElement frameElement=driver.findElement(frameLocator);
        driver.switchTo().frame(frameElement);
        wait.until(ExpectedConditions.presenceOfElementLocated(tagText));
        driver.findElement(tagText).click();
        selectJQueryDate("21");
    }

    public void selectJQueryDate(String date) {

        wait.until( ExpectedConditions.presenceOfElementLocated(By.id("ui-datepicker-div")));
        WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
        System.out.println("JQuery Calendar Dates");

        List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
        for (WebElement row : tableRows) {
            List<WebElement> cells = row.findElements(By.xpath("td"));

            for (WebElement cell : cells) {
                if (cell.getText().equals(date)) {
                    driver.findElement(By.linkText(date)).click();
                }
            }
        }
    }
}
