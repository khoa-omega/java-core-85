import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOManager {
    public static void writeBytes(
            String path, byte[] bytes, boolean append
    ) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
        ) {
            fos.write(bytes);
        }
    }

    public static byte[] readBytes(String path) throws IOException {
        try (
                FileInputStream fis = new FileInputStream(path);
        ) {
            return fis.readAllBytes();
        }
    }

    public static void writeObject(
            String path, Object object, boolean append
    ) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(object);
        }
    }

    public static Object readObject(String path)
            throws IOException, ClassNotFoundException {
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return ois.readObject();
        }
    }
}
