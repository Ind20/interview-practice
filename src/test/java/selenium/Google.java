package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for(WebElement e: links){
            System.out.println(e.getText());
        }

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Indresh");

        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

        ((JavascriptExecutor) driver).executeScript("return document.readyState");

        List<WebElement> searchLinks = driver.findElements(By.xpath("//a/h3[contains(text(),'Indresh')]"));
        System.out.println("Print "+searchLinks.size()+" links with name: ");
        for(WebElement el:searchLinks){
            System.out.println(el.getText());
        }

        driver.quit();

    }
}
