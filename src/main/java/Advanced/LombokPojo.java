package Advanced;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
class User {
    private String name;
    private int age;
    private String bankName;

}

public class LombokPojo {
    public static void main(String[] args) {
        User user = new User("Amit", 30, "BOB");

        System.out.println(user);

        user.setAge(40);
        user.setName("Mayank");
        user.setBankName("SBI");

        System.out.println(user);

    }
}

