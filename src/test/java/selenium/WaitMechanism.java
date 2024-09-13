package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WaitMechanism {
    static WebDriver driver = new ChromeDriver();
    static WebElement element;

    public static void implicitlyWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        System.out.println("Implicitly waited for 10 seconds");
    }

    public static WebElement explicitlyWait(int time, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println("Explicitly waited for "+time+" seconds");
        return element;
    }

    public static WebElement fluentlytlyWait(int time, int polligTime, By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(polligTime))
                .ignoring(NoSuchElementException.class)
                .withMessage("Element not found within the time limit");
        element = wait.until(driver -> {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed()) {
                return element;
            } else {
                return null;
            }
        });
        System.out.println("Fluently waited for "+time+" seconds with polling of "+polligTime+" seconds");
        return element;
    }

    public static void main(String[] args) {

        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        //implicitlyWait(10);
        //element = driver.findElement(By.xpath("//*[text()='Log in']"));
        By locator = By.xpath("//*[text()='Log in']");
        element = fluentlytlyWait(60, 5, locator);
        element.click();
    }
}
