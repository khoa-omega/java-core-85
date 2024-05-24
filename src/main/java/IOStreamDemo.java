import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src/main/resources/abc.txt";

        String text = "high.score=1000";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        IOManager.writeBytes(path, bytes, true);
        IOManager.writeBytes(path, bytes, true);
        IOManager.writeBytes(path, bytes, false);

        byte[] result = IOManager.readBytes(path);
        String content = new String(result, StandardCharsets.UTF_8);
        System.out.println(content);
        System.out.println("high.score = " + content.split("=")[1]);

        Account account = new Account(
                1,
                "Nguyễn Văn Khoa",
                "khoa.nv",
                "123456!@#"
        );
        IOManager.writeObject(path, account, false);

        Account savedAccount = (Account) IOManager.readObject(path);
        System.out.println(savedAccount);
    }
}
