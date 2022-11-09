import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("data1");
        System.out.println(arrayDeque);
        arrayDeque.offer("data2");
        System.out.println(arrayDeque);
        arrayDeque.offer("data3");
        System.out.println(arrayDeque);

        String result = arrayDeque.remove();
        System.out.println(result);
        System.out.println(arrayDeque);

        LinkedList<String> linkedQueue = new LinkedList<>();

    }
}
