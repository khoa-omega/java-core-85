import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createdDate;

    Account() {
    }

    Account(
            int id,
            String email,
            String username,
            String firstName,
            String lastName
    ) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
    }

    Account(
            int id,
            String email,
            String username,
            String firstName,
            String lastName,
            Position position
    ) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createdDate = LocalDate.now();
    }
}