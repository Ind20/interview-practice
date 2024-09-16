package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonHoverColor {
    WebDriver driver = new ChromeDriver();
    @Test
    public void buttonHoverColor() throws InterruptedException {
        try {
            driver.manage().window().maximize();
            driver.get("https://pdbhutia.github.io/pagesforautomation/");
            By locator = By.xpath("//button[@class='coffee']");
            WebElement element = driver.findElement(locator);
            Actions actions = new Actions(driver);
            Thread.sleep(3000);
            actions.moveToElement(element).perform();
            String colorAfterHover = element.getCssValue("background-color");
            System.out.println("Color after hover: " + colorAfterHover);
            Thread.sleep(3000);
            Assert.assertEquals(colorAfterHover, "rgba(0, 255, 255, .1)", "color after hover is not rgba(0, 255, 255, 1)");
            driver.quit();
        }catch(Exception e){
            System.out.println("Exception was found");
            e.printStackTrace();

        }

    }
}
