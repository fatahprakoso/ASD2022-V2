import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A","B","C","D","E"));

        System.out.printf("list         : %s\n", list);
        System.out.println();


        // getter
        System.out.println("\nGetter:");

        System.out.printf("getFirst()   : %s\n",list.getFirst());
        System.out.printf("getLast()    : %s\n",list.getLast());
        System.out.printf("get(3)       : %s\n",list.get(3));


        // add
        System.out.println("\nAdd:");

        list.add("Z");
        System.out.printf("add(\"Z\")     : %s\n",list);

        list.add(3,"K");
        System.out.printf("add(3, \"K\")  : %s\n",list);

        list.addFirst("Y");
        System.out.printf("addFirst(\"Y\"): %s\n",list);

        list.addLast("F");
        System.out.printf("addLast(\"F\") : %s\n",list);


        // remove
        System.out.println("\nRemove:");

        list.remove(5);
        System.out.printf("remove(5)    : %s\n", list);

        list.remove("Y");
        System.out.printf("remove(\"Y\")  : %s\n", list);

        list.removeFirst();
        System.out.printf("removeFirst(): %s\n", list);

        list.removeLast();
        System.out.printf("removelast() : %s\n", list);


        // replace
        System.out.println("\nReplace:");

        list.set(0,"Z");
        System.out.printf("set(0,\"Z\")   : %s\n", list);


        // copy list
        System.out.println("\nCopy List:");

        LinkedList<String> listKe2 = (LinkedList<String>) list.clone();
        System.out.printf("clone()      : %s\n", listKe2);

        listKe2.add("listKe2");
        System.out.printf("listKe2      : %s\n", listKe2);

        System.out.printf("list         : %s\n", list);
        System.out.println();


        // utils
        System.out.println("\nUtils:");

        System.out.printf("size()       : %s\n", list.size());

        System.out.printf("indecOf(\"C\") : %s\n", list.indexOf("C"));

        System.out.printf("contains(\"E\"): %s\n", list.contains("E"));

        Object[] listToArray = list.toArray();
        System.out.println("toArray()[2] : " + listToArray[2]);
    }
}