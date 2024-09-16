package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Allert {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:/Users/Indresh%20Maurya/eclipse/practice/src/test/java/seleniumpractice/CopyPaste.html");
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        Thread.sleep(3000);

        alert.accept();
        Thread.sleep(3000);
//
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('I ma new alert')");
        Thread.sleep(3000);
        File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(System.getProperty("user.dir"));
        File dest = new File(System.getProperty("user.dir")+"\\src\\test\\java\\seleniumpractice\\ss.png");
        FileUtils.copyFile(ss,dest);
        driver.quit();
    }
}
