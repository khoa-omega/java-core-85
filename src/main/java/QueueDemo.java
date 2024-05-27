import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue = new LinkedList<>();

        // Thêm phần tử vào cuối hàng đợi
        queue.offer(2);
        queue.offer(8);
        queue.offer(3);
        queue.offer(5);

        System.out.println(queue);

        // Xem phần tử ở đầu hàng đợi
        int peek = queue.peek();
        System.out.println("peek = " + peek);

        System.out.println(queue);

        // Lấy phần tử ở đầu hàng đợi
        int poll = queue.poll();
        System.out.println(poll);

        System.out.println(queue);

        // Xử lý queue
        while (!queue.isEmpty()) {
            int top = queue.poll();
            System.out.println("top = " + top);
            System.out.println(queue);
        }
    }
}
