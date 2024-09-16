package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Flipkart {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        String text = "Smartphones";

        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
        links.get(links.size()-1).click();
        List<String> tabs = new ArrayList<>(new HashSet<>(driver.getWindowHandles()));
        driver.switchTo().window(tabs.get(0));

        //driver.close();
    }

}
