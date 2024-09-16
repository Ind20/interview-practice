package playwright;

import com.microsoft.playwright.*;

public class TextArea {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();


        page.navigate("https://pdbhutia.github.io/pagesforautomation/elementRepository.html");
        String paraText = page.locator("//p[@class='para']").textContent();
        Thread.sleep(3000);
        page.fill("//textarea[@class='review']", paraText);
        Thread.sleep(3000);


        page.close();
        browser.close();
        playwright.close();
    }
}
