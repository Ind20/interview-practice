package playwright;

import com.microsoft.playwright.*;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://pdbhutia.github.io/pagesforautomation/elementRepository.html");
        Locator locator = page.locator("//input[@class='checkbox1']");
        Thread.sleep(5000);
        locator.click();
        Thread.sleep(5000);

        Locator locator1 = page.locator("//input[@class='checkbox2']");
        locator1.click();
        Thread.sleep(5000);
        boolean isEnabled = locator1.isEnabled();
        Assert.assertTrue(isEnabled, "checkbox is not enabled");

        page.close();
        browser.close();
        playwright.close();

    }
}
