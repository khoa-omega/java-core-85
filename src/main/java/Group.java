import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdDate;
    Account[] accounts;

    Group() {
    }

    Group(String name, Account creator, Account[] accounts, LocalDate createdDate) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createdDate = createdDate;
    }

    Group(String name, Account creator, String[] usernames, LocalDate createdDate) {
        this.name = name;
        this.creator = creator;
        Account[] acc = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account a = new Account();
            a.username = usernames[i];
            acc[i] = a;
        }
        this.accounts = acc;
        this.createdDate = createdDate;
    }
}