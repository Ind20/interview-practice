package selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DataProvidr {

    // Data Provider Method
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };
    }

    // Test Method using Data Provider
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        // Simulate login test
        System.out.println("Logging in with username: " + username + " and password: " + password);

        // Add assertions (placeholders for actual test logic)
        Assert.assertTrue(true, "Login test passed");
    }
}

