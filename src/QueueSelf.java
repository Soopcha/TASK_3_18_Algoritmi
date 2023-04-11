import java.util.Arrays;
import java.util.LinkedList;

public class QueueSelf {
    public static LinkedList<String> GetAnswer(int n) throws Exception {
        LinkedList<String> list = new LinkedList<>();

        int col = 1;

        for (int i = 1; i <= n; i++) {
            SimpleQueue<Integer> queue = new SimpleLinkedListQueue<>();
            for (int j = 1; j <= col; j++) {
                queue.add(j);
            }
            int size = queue.count();
            int[] array = new int[size];
            for (int l = 0; l < size; l++) {
                array[l] = queue.remove();
            }
            String arr = Arrays.toString(array);
            list.add(arr);
            col++;
        }
        return list;
    }
}
