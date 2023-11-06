
public class BST {
     private Node root;
     public BST()
     {
         root=null;
     }

    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node()
        {
            data=0;
            left=null;
            right=null;
        }
        public Node(int val)
        {
            data=val;
            left=null;
            right=null;
        }

    }

    public void addNode(int value)
     {
         Node newNode = new Node(value);

         if(root==null)
             root=newNode;
         else
         {
                Node trav = root;
                while (true)
                {

                    if (value < trav.data) {
                        if (trav.left != null)
                            trav = trav.left;
                        else {
                            trav.left = newNode;
                            break;
                        }
                    }
                    else //value > trav.data
                    {
                        if(trav.right!=null)
                            trav=trav.right;
                        else {
                            trav.right=newNode;
                            break;
                        }
                    }

                }

         }
     }

     public void preorder()
     {
         preOrder(root);
     }
     public void preOrder(Node trav)
     {
         if(trav==null)
             return;
         System.out.print(trav.data+"->");
         preOrder(trav.left);
         preOrder(trav.right);
     }

    public void inorder()
    {
        inOrder(root);
    }
    public void inOrder(Node node)
    {
        if(node==null)
            return;

        preOrder(node.left);
        System.out.print(node.data+"->");
        preOrder(node.right);
    }
    public void postorder()
    {
        postOrder(root);
    }
    public void postOrder(Node nodeData)
    {
        if(nodeData==null)
            return;

        preOrder(nodeData.left);
        preOrder(nodeData.right);
        System.out.print(nodeData.data+"->");
    }

}
