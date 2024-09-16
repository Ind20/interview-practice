package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        
        File ssFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots\\ss.png");
        FileUtils.copyFile(ssFile, dest);

//        FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("ss1.png"));
        driver.quit();


    }
}
