package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckAlert {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame("iframeResult");
        WebElement ele = driver.findElement(By.xpath("//*[text()='Try it']"));
        ele.click();
        Assert.assertEquals(isAlertPresent(), true, "Alert is not present");
        driver.quit();
    }

    public static boolean isAlertPresent() {
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert found: " + alert.getText());
            return true;
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present.");
            return false;
        }
    }


}
