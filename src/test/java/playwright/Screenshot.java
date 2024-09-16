package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

public class Screenshot {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate("https://www.google.co.in/");
        System.out.println("Navigated to "+page.title());

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots\\screenshot.png")).setTimeout(100));

    }
}
