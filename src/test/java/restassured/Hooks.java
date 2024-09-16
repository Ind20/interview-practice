package restassured;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hooks {

    String filePath = System.getProperty("user.dir")+"\\extent-report.html";
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Before
    public void beforeScenario(Scenario scenario) {
        ExtentTest test = CucumberTestRunner.extent.createTest(scenario.getName());
        extentTest.set(test);
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        try {
            ExtentTest test = extentTest.get();
            if (scenario.isFailed()) {
                test.fail("Scenario failed");
            } else {
                test.pass("Scenario passed");
            }
            Desktop dt = Desktop.getDesktop();
            File file = new File(filePath);
            dt.open(file);
            file = new File(System.getProperty("user.dir")+"\\target\\reports\\cucumber-report.html");
            dt.open(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ExtentTest getExtentTest() {
        return extentTest.get();
    }
}
