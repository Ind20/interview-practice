package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Google {
    static WebDriver driver = new ChromeDriver();
    public static void searchAndPrintPageTitle(String name) throws InterruptedException {


        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys(name);
        search.sendKeys(Keys.ENTER);

        WebElement link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(), '"+name+"')])[1]"));
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println("Page title is :"+driver.getTitle());
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.google.co.in/");

        searchAndPrintPageTitle("Indresh");
        //searchAndPrintPageTitle("Kumar");
        //searchAndPrintPageTitle("Ram");

        driver.quit();
    }

}
