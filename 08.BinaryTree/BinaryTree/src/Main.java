public class Main {
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>();

        tree.insert("A",tree.root,true);
        tree.insert("B",tree.root,true);
        tree.insert("C",tree.root,false);
        tree.insert("D",tree.root.left,true);
        tree.insert("E",tree.root.right,true);
        tree.insert("F",tree.root.right,false);
        tree.insert("G",tree.root.right.left,false);
        tree.postOrderTraversal();
//        tree.print();
    }
}

class BinaryTree<E>{
    Node root;

    class Node {
        private E data;
        Node left, right;

        Node(E data){
            this.data = data;
        }

        E getData(){
          return data;
        }

        public void print() {
            print("", this, false);
        }

        public void print(String prefix, Node n, boolean isLeft) {
            if (n != null) {
                System.out.println (prefix + (isLeft ? "├── " : "└── ") + n.data);
                print(prefix + (isLeft ? "|   " : "    "), n.left, true);
                print(prefix + (isLeft ? "|   " : "    "), n.right, false);
            }
        }
    }

    void insert(E data, Node parentTarget, boolean isLeft){
        if(root == null){
            root = new Node(data);
            return;
        }

        if(isLeft){
            // menambahkan child node di parentTarget Node di sebelah kiri

            if(parentTarget.left == null) {
//                menambahkan data
                parentTarget.left = new Node(data);
            }


        } else {
            // menambahkan child node di parentTarget Node di sebelah kanan

            if(parentTarget.right == null) {
//                menambahkan data
                parentTarget.right = new Node(data);
            }
        }
    }

    void inOrderTraversal(){
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node node){
        if(node == null) return;

        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    void preOrderTraversal(){
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node node){
        if(node == null) return;

        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void postOrderTraversal(){
        postOrderTraversal(this.root);
    }

    private void postOrderTraversal(Node node){
        if(node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    Node searchingInOrderSearch(E key){
        return searchingInOrderSearch(root, key);
    }

    Node searchingInOrderSearch(Node node, E key){
        if(node == null) return null;

        Node result;

        result = searchingInOrderSearch(node.left, key);
        if(result != null) return result;

        if(node.data.equals(key)) return node; // kalau misalkan node.data equals dengan key, maka return node tersebut

        result = searchingInOrderSearch(node.right, key);
        return result;
    }

    void print(){
        root.print();
    }
}




//class BinaryTree<E> {
//    Node root;
//
//    class Node{
//        Node left, right;
//        private E data;
//
//        Node(E data){
//            this.data = data;
//        }
//
//        public E getData() {
//            return data;
//        }
//
//        public void print() {
//            print("", this, false);
//        }
//
//        public void print(String prefix, Node n, boolean isLeft) {
//            if (n != null) {
//                System.out.println (prefix + (isLeft ? "├── " : "└── ") + n.data);
//                print(prefix + (isLeft ? "|   " : "    "), n.left, true);
//                print(prefix + (isLeft ? "|   " : "    "), n.right, false);
//            }
//        }
//    }
//
//    boolean insert(E data, boolean isLeft, Node parent){
//        boolean insertable;
//
//        if(root==null){
//            root = new Node(data);
//            return true;
//        }
//
//        if(isLeft){
//            insertable = parent.left == null;
//
//            if(insertable) {
//                parent.left = new Node(data);
//            }
//        } else {
//            insertable = parent.right == null;
//
//            if(insertable) {
//                parent.right = new Node(data);
//            }
//        }
//
//        return insertable;
//    }
//
//    void inOrderTraversal(){
//        inOrderTraversal(root);
//    }
//
//    private void inOrderTraversal(Node node){
//        if (node==null){
//            return;
//        }
//
//        inOrderTraversal(node.left);
//        System.out.println(node.data);
//        inOrderTraversal(node.right);
//    }
//
//    Node searchWithInOrderTraversal(E data){
//        return searchWithInOrderTraversal(root, data);
//    }
//
//    private Node searchWithInOrderTraversal(Node node, E data){
//        if (node==null){
//            return null;
//        }
//
//        Node result;
//
//        result = searchWithInOrderTraversal(node.left, data);
//        if(result != null) return result;
//
//        if(node.getData().equals(data)) return node;
//
//        result = searchWithInOrderTraversal(node.right, data);
//        return result;
//    }
//
//    boolean dynamicInsert(E data, boolean isLeft, E parent){
//        Node parentNode = searchWithInOrderTraversal(parent);
//
//        if(parentNode==null) return false;
//
//        if(isLeft){
//            if(parentNode.left != null) return false;
//            parentNode.left = new Node(data);
//        } else {
//            if(parentNode.right != null) return false;
//            parentNode.right = new Node(data);
//        }
//
//        return true;
//    }
//
//    void print(){
//        root.print();
//    }
//}
