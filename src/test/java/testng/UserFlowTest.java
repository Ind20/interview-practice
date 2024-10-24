package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserFlowTest {

    @BeforeClass
    public void openApplication() {
        System.out.println("Application opened.");
    }

    @Test(dataProvider = "loginData")
    public void userFlowTest(String username, String password, String newName) {
        // Step 1: Login
        login(username, password);

        // Step 2: Edit Profile
        editProfile(newName);

        // Step 3: Logout
        logout();
    }

    @AfterClass
    public void closeApplication() {
        System.out.println("Application closed.\n");
    }
    private void login(String username, String password) {
        System.out.println("Logging in with Username: " + username + " and Password: " + password);
        assert username != null : "Username cannot be null";
    }

    private void editProfile(String newName) {
        System.out.println("Editing profile with new name: " + newName);
        assert !newName.isEmpty() : "New name cannot be empty";
    }

    private void logout() {
        System.out.println("Logging out.");
    }

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][]{
                {"user1", "pass1", "John Doe"},
                {"user2", "pass2", "Jane Smith"},
                {"admin", "admin123", "Admin User"}
        };
    }
}

