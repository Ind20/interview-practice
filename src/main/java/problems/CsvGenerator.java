package problems;

import java.io.FileWriter;
import java.io.IOException;

public class CsvGenerator {
    public static void main(String[] args) {
        String csvFilePath = System.getProperty("user.dir")+"\\src\\test\\java\\resources\\users.csv";

        try (FileWriter writer = new FileWriter(csvFilePath)) {
            // Write header
            writer.write("userId,username,password,email\n");

            // Generate and write 10 rows of data
            for (int i = 1; i <= 10; i++) {
                String userId =  Integer.toString(i);
                String username = "username" + i;
                String password = "password" + i;
                String email    = "email" +i+ "@gmail.com";

                writer.write(userId + "," +username + "," + password + "," +email+ "\n");
            }

            System.out.println("CSV file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
