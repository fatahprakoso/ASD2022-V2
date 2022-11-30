import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(5);
        tree.add(2);
        tree.add(7);
        tree.addAll(List.of(4,3,2,1,8));

        tree.remove(5);

        for (int i: tree) {
            System.out.printf("%d, ", i);
        }

        System.out.println();

        System.out.println(tree.ceiling(5)); // mengambil data terdekat di atasnya
        System.out.println(tree.floor(5)); // mengambil data terdekat di bawahnya

        System.out.println(tree.first());
        System.out.println(tree.last());

        System.out.println(tree.contains(9));
    }
}













//tree.addAll(List.of(3,1,5,7,2,4));
//
//        for (int i : tree){
//        System.out.printf("%d, ", i);
//        }
//        System.out.println();
//
//        System.out.println(tree.ceiling(6));
//        System.out.println(tree.floor(6));
//        System.out.println(tree.first());
//        System.out.println(tree.last());

