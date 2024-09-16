package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FindElementInInIframes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jsfiddle.net/");
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframes :"+iframes.size());
        for (WebElement iframe : iframes) {
            try {
                driver.switchTo().frame(iframe);
                WebElement element = driver.findElement(By.xpath("//div[@id='download-link-wrapper']"));
                if (element != null) {
                    System.out.println("Element is found");
                }
            } catch (Exception e) {
                System.err.println("Cannot access iframe: " + e.getMessage());

            }
        }
    }
}
