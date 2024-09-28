package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverColor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:/Users/Indresh%20Maurya/eclipse/practice/src/test/java/seleniumpractice/CopyPaste.html");
        Actions actions = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//button[@class='btn']"));
        actions.moveToElement(ele).perform();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String colorOnHover = (String) js.executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('background-color');", ele);


    }
}
