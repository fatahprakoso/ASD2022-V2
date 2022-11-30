import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(5,4);
        graph.print();
    }
}

class Graph {
    private ArrayList<Integer>[] node = new ArrayList[10];
    private int size = 0;

    public void addEdge(int v1, int v2){
        if(size==node.length){
            node = Arrays.copyOf(node, size*2);
        }

        if(v1==v2) return;

        ArrayList<Integer> searchedV1 = search(v1);
        ArrayList<Integer> searchedV2 = search(v2);


        if(searchedV1 == null) {
            node[size] = new ArrayList<Integer>(List.of(v1));
            searchedV1 = node[size];
            size++;
        }

        if(searchedV2 == null){
            node[size] = new ArrayList<Integer>(List.of(v2));
            searchedV2 = node[size];
            size++;
        }

        searchedV1.add(v2);
        searchedV2.add(v1);
    }

    public void print(){
        for (ArrayList<Integer> list: node) {
            if(list == null) return;

            if(!list.equals(node[0])){
                System.out.println();
                System.out.println("|");
            }

            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
                if(i!=list.size()-1) System.out.print(" -> ");
            }
        }
    }

    private ArrayList<Integer> search(int key){
        for (ArrayList<Integer> list: node) {
            if(list==null) return null;
            if(list.get(0)==key){
                return list;
            }
        }
        return null;
    }
}