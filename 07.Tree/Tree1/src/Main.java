public class Main {
    public static void main(String[] args) {

    }
}

class NodeTree {
    String data;
    NodeTree child[];

    NodeTree(){

    }

    NodeTree (String data, NodeTree[] child){
        this.data = data;
        this.child = child;
    }
}

class Tree {
    NodeTree root;
    int size; // jumlah node yang ada di dalam tree
    int order; // level hirarki dari tree

    Tree(){
    }

    Tree(NodeTree root){
        this.root = root;
    }

    // insert("A", "C") : child C di node A
    void insert(NodeTree parent, NodeTree child){

    }

    void remove(NodeTree key){

    }

    NodeTree search(String key){

    }

    NodeTree preorder(){
        return null;
    }

    NodeTree inorder(){
        return null;
    }

    NodeTree postorder(){
        return null;
    }
}
