import java.io.File;
import java.io.IOException;

public class FileManager {
    // Kiểm tra file có tồn tại hay không
    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }

    // Tạo mới file
    public static boolean createFile(String path) throws IOException {
        if (exists(path)) {
            throw new IllegalStateException("Error! File Exist.");
        }
        File file = new File(path);
        return file.createNewFile();
    }

    // Xóa file
    public static boolean delete(String path) {
        if (!exists(path)) {
            throw new IllegalStateException("Error! File Not Exist.");
        }
        File file = new File(path);
        return file.delete();
    }

    // Kiểm tra file
    public static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile();
    }

    // Kiểm tra folder
    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    // Lấy ra danh sách file có trong folder
    public static String[] list(String path) {
        File file = new File(path);
        return file.list();
    }

    // Tạo folder
    public static boolean mkdirs(String path) {
        File file = new File(path);
        return file.mkdirs(); // make directories
    }
}
