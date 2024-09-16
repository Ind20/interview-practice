package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static org.testng.AssertJUnit.assertEquals;

public class AssertText {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://pdbhutia.github.io/pagesforautomation/elementRepository.html");
        String paraText = page.locator("//p[@class='para']").textContent();
        assertEquals(paraText, " The first elemement we have is paragrpah.");

        page.close();
        browser.close();
        playwright.close();
    }
}
