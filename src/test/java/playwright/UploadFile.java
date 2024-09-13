package playwright;

import com.microsoft.playwright.*;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class UploadFile {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://pdbhutia.github.io/pagesforautomation/");

        page.getByText("Elements").click();

        Locator uploadFiled = page.locator("//input[@class='uploadfield']");
        uploadFiled.setInputFiles(Paths.get(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\users.csv"));
        Thread.sleep(5000);

        page.close();
        browser.close();
        playwright.close();
    }
}
