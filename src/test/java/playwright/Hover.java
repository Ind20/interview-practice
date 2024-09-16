package playwright;

import com.microsoft.playwright.*;

import java.util.Locale;

public class Hover {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext();
        Page page = browser.newPage();

        page.navigate("https://pdbhutia.github.io/pagesforautomation/");
        Locator locator = page.locator("//button[@class='coffee']");
        String bgColor = locator.evaluate("el => getComputedStyle(el).backgroundColor").toString();
        System.out.println("Button Background Color: " + bgColor);
        Thread.sleep(5000);
        locator.hover();
        Thread.sleep(5000);
        bgColor = locator.evaluate("el => getComputedStyle(el).backgroundColor").toString();
        System.out.println("Button Background Color: " + bgColor);


        page.close();
        browser.close();
        playwright.close();
    }
}
