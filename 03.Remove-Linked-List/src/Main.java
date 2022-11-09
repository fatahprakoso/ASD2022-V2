import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(List.of('A','B','C','D','E','F','G','H'));

        System.out.printf("list               : %s\n", list);

        list.removeFirst();
        System.out.printf("list.removeFirst() : %s\n", list);

        list.removeLast();
        System.out.printf("list.removeLast()  : %s\n", list);

        list.remove(10);
        System.out.printf("list.remove(3)     : %s\n", list);

        list.remove((Object)'Z');
        System.out.printf("list.remove('F')   : %s\n", list);

        list.pop();
        System.out.printf("list.pop()         : %s\n", list);

        list.clear();
        System.out.printf("list.clear()       : %s\n", list);
    }
}