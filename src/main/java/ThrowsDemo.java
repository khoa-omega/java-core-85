import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            var streamer = new IOStream();
            streamer.write();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
