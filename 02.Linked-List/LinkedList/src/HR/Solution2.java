import java.util.Scanner;

public class Solution2 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
		int commandCount = in.nextInt(); in.nextLine();
        LinkedList<String> kereta = new LinkedList<>();

        for(int i=0; i<commandCount; i++){
            String perintah = in.nextLine();

            if(perintah.equals("LIHAT")){
                System.out.println(kereta);
            } else{
                if(perintah.substring(9,perintah.length()).equals("AWAL")){
                    kereta.addFirst(perintah.substring(7,8));
                } else{
                    kereta.addLast(perintah.substring(7,8));
                }
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

	public T getFirst() {
		return this.head.data;
    }

	public T getLast() {
		return this.tail.data;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node<T> temp = this.head;
        while (temp != null) {
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