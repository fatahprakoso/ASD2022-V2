import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack);

        stack.push("A");

        System.out.println(stack);

        stack.push("B");

        System.out.println(stack);

        stack.push("C");

        System.out.println(stack);

        System.out.println();
        String dataKeluar = stack.pop();
        System.out.println("stack: " + stack);
        System.out.println("data yang keluar: " + dataKeluar);

        System.out.println();
        dataKeluar = stack.pop();
        System.out.println("stack: " + stack);
        System.out.println("data yang keluar: " + dataKeluar);

//        stack.push("D");
//        stack.push("E");
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//        System.out.println(stack);
    }
}
