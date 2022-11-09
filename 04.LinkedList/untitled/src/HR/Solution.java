package HR;

// Hapus duplikat

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static Scanner in = new Scanner(System.in);
    static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) {
        // Buat Instance LinkedList bertipe data String

        int commandCount = in.nextInt(); in.nextLine();

        for (int i = 0; i < commandCount; i++) {
            printUnique();
        }
    }

    static void printUnique(){
        String[] arr = in.nextLine().split(" ");

        list.addAll(List.of(arr));

        // Lakukan konversi lowercase
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i).toLowerCase());
        }


        // hapus data terduplikasi
        LinkedList<Integer> indeks = new LinkedList<>();
        for (int i = 0; i < list.size()-1; i++) {
            for (int j=i+1; j<list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    indeks.add(j);
                    System.out.println(j + " : j");
                }
            }
            for (int k : indeks) {
                list.remove(k);
            }
            System.out.println(i);
            indeks.clear();
        }

        System.out.println(list);
    }
}
