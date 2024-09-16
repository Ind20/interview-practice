package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {
    public static void copyPaste() throws InterruptedException {
        try {
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
//            options.addArguments("--disable-gpu");
//            WebDriver driver = new ChromeDriver(options);
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("C:/Users/Indresh%20Maurya/eclipse/practice/src/test/java/seleniumpractice/CopyPaste.html");

            WebElement fname = driver.findElement(By.id("fname"));
            fname.sendKeys("12345");
            Thread.sleep(3000);

            WebElement lname = driver.findElement(By.id("lname"));

            Actions actions = new Actions(driver);
            actions
                    .moveToElement(fname)
                    .click()
                    .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .sendKeys("c")
                    .keyUp(Keys.CONTROL)
                    .perform();

            Thread.sleep(3000);

            actions
                    .moveToElement(lname)
                    .click()
                    .keyDown(Keys.CONTROL)
                    .sendKeys("v")
                    .keyUp(Keys.CONTROL)
                    .perform();
            Thread.sleep(3000);

            System.out.println("Pasted text: " + lname.getAttribute("value"));

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
