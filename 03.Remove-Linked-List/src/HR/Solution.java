/* Dilarang mengimpor library lain */
import java.util.Scanner;

public class Solution {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        int commandCount = in.nextInt(); in.nextLine();

        for(int i=0; i<commandCount; i++){
            String command = in.nextLine();
            if(command.contains("TAMBAH")){
                if(command.contains("AWAL")) list.addFirst(command.substring(7,8));
                else list.addLast(command.substring(7,8));
            } else if(command.contains("LEPAS")){
                if(list.isEmpty()) continue;

                if(command.contains("AWAL")) list.removeFirst();
                else list.removeLast();
            } else{
              System.out.println(list);
            }
        }



    }
}


/* Jangan ubah kode di bawah ini */

class LinkedList<T> {
    private Node<T> head, tail;
    private int size = 0;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = this.tail = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = this.tail = node;
        }
        else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (this.head == this.tail) {
                this.head = this.tail = null;
            }
            else {
                Node<T> temp = this.head;
                this.head = null;
                this.head = temp.next;
            }
            this.size--;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (this.head == this.tail) {
                this.head = this.tail = null;
            }
            else {
                Node<T> temp = this.head;
                while (temp.next != this.tail) temp = temp.next;
                this.tail = temp;
                this.tail.next = null;
            }
            this.size--;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

      public T getFirst() {
        return this.head.data;
    }

    public T getLast() {
        return this.tail.data;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("<");
        Node<T> temp = this.head;
        if(this.head!=null) s.append("-");
        for (int i = 0; i < this.size; i++) {
            s.append(temp.data);
            if (temp.next != null) s.append("-");
            temp = temp.next;
        }
        return s.toString();
    }
}

class Node<T> {
    public T data;
    public Node<T> next;

    public Node() {
        this(null);
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}