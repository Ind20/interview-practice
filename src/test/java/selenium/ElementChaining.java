package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementChaining {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement parent = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']"));
        WebElement luckyButton = parent.findElement(By.xpath("(//input[@class=\"RNmpXc\"])[2]"));
        luckyButton.click();
    }
}
