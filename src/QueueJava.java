import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static LinkedList<Queue<Integer>> Testing(int n) {
        LinkedList<Queue<Integer>> list = new LinkedList<>();

        int col = 1;

        for (int i = 1; i <= n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            for (int j = 1; j <= col; j++) {
                queue.add(j);
            }
            list.add(queue);
            col++;
        }
        return list;
    }
}
