import java.util.Scanner;

public class Exercise05 {
    void question05() {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Mời bạn nhập vào thông tin account");

        System.out.println("Nhập vào id:");
        account.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào email:");
        account.email = scanner.nextLine();

        System.out.println("Nhập vào username:");
        account.username = scanner.nextLine();

        System.out.println("Nhập vào full name:");
        account.fullName = scanner.nextLine();

        Position position = new Position();
        System.out.println("Nhập vào position id:");
        position.id = scanner.nextInt();
        System.out.println("Chọn position name:");
        System.out.println("1. DEV");
        System.out.println("2. TEST");
        System.out.println("3. SCRUM MASTER");
        System.out.println("4. PM");
        int menu = scanner.nextInt();
        while (menu < 1 || menu > 4) {
            System.err.println("Nhập lại");
            menu = scanner.nextInt();
        }
        if (menu == 1) {
            position.name = PositionName.DEV;
        } else if (menu == 2) {
            position.name = PositionName.TEST;
        } else if (menu == 3) {
            position.name = PositionName.SCRUM_MASTER;
        } else {
            position.name = PositionName.PM;
        }
        account.position = position;

        System.out.println("account id: " + account.id);
        System.out.println("account username: " + account.username);
        System.out.println("account position: " + account.position.name);
    }
}
