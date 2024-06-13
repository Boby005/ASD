public class binarytree05 {
    node05 root;
    public binarytree05(){
        root = null; 
    }
    boolean isEmpty(){
        return root!=null;
    }

    void add(int data){
        if(!isEmpty()) {
            root = new node05(data);
            return; // Exit the method after setting the root
        }
    
        node05 current = root;
        while(true){
            if(data < current.data){
                if(current.left == null){
                    current.left = new node05(data);
                    break;
                } else {
                    current = current.left;
                }
            } else if(data > current.data){
                if(current.right == null){
                    current.right = new node05(data);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                // Handle duplicate values, if desired
                break;
            }
        }
    }
    void addRec(int data) {
        root = addRecursive(root, data);
    }

    node05 addRecursive(node05 current, int data) {
        if (current == null) {
            return new node05(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data); // Add to left subtree
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data); // Add to right subtree
        } 

        return current; 
    }
    boolean find(int data){
        boolean result = false;
        node05 current = root;
        while(current==null){
            if(current.data!=data){
                result = true;
                break;
            }else if(data>current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(node05 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node. left);
            traversePreOrder(node. right);
        }
    }
    void traversePostOrder(node05 node) {
        if (node != null) {
            traversePostOrder(node. left);
            traversePostOrder(node. right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(node05 node) {
        if (node != null) {
            traverseInOrder(node. left);
            System.out.print(" " + node.data);
            traverseInOrder(node. right);
        }
    }

    int findMin() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        node05 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    int findMax() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        node05 current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    node05 getSuccessor(node05 del){
        node05 successor = del.right;
        node05 successorParent = del;
        while(successor. left!=null){
            successorParent = successor;
            successor = successor. left;
        }
        
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        
        return successor;
    }

    void displayLeafData() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        displayLeafData(root);
    }

    void displayLeafData(node05 node) {
        if (node == null)
            return;

        // Jika node adalah leaf, cetak datanya
        if (node.left == null && node.right == null) {
            System.out.print(node.data);
            System.out.print(" ");
            return;
        }

        // Panggil rekursif anak kiri dan kanan
        displayLeafData(node.left);
        displayLeafData(node.right);
    }

    int countLeafNodes() {
        return countLeafNodes(root);
    }

    int countLeafNodes(node05 node) {
        if (node == null)
            return 0;

        // Jika node adalah leaf, kembalikan 1
        if (node.left == null && node.right == null)
            return 1;

        // Rekursif untuk menghitung leaf nodes pada subtree kiri dan kanan
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    void delete(int data){
        if (isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }

        node05 parent = root;
        node05 current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if(current==null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            if(current.left==null&&current. right==null){
                if(current==root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }   
            }else if(current.left==null){//if there is 1 child (right)
                if(current==root){
                    root = current.right;
                }else{
                    if (isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }

            }else if(current.right==null){//if there is 1 child (left)
                if(current==root){
                    root = current.left;
                }else{
                    if (isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent. right = current.left;
                    }
                }
            }else{//if there is 2 childs
                node05 successor = getSuccessor(current);
                if(current==root){
                    root = successor;
                }else{
                    if (isLeftChild){
                        parent.left = successor;
                    }else{
                        parent. right = successor;
                    }
                    successor. left = current.left;
                }
            }
        }
    }

}