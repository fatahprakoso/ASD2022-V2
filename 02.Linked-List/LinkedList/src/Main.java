import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "D", "A", "C", "C", "A"));
        System.out.println(list);

        System.out.println("size()          : " + list.size());

        System.out.println("isEmpty()       : " + list.isEmpty());

        list.add("XYZ");
        System.out.println("add('XYZ')      : " + list);

        list.add(5,"ABC");
        System.out.println("add(5,'ABC')    : " + list);

        list.addFirst("asd");
        System.out.println("addFirst('asd') : " + list);

        list.addLast("dsa");
        System.out.println("addLast('dsa')  : " + list);

        list.push("ga");
        System.out.println("push('ga')      : " + list);

        System.out.println("getFirst()      : " + list.getFirst());

        System.out.println("getLast()       : " + list.getLast());

        System.out.println("get(10)          : " + list.get(10));

        System.out.println("toString()      : " + list.toString());
    }
}