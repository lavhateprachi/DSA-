import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                Scanner sc=new Scanner(System.in);
                BST tree = new BST();
                boolean exit=false;
                while(!exit)

                {
                    System.out.println();
                    System.out.println("Menu..");
                    System.out.println("1.Add node");
                    System.out.println("2.Preorder");
                    System.out.println("3.Inorder");
                    System.out.println("4.Postorder");
                    System.out.println("5.Exit");
                    switch(sc.nextInt())
                    {
                        case 1:
                            System.out.println("Enter Data:");
                            int data=sc.nextInt();
                            tree.addNode(data);
                            break;

                        case 2:
                            System.out.println("PREORDER---->");
                            tree.preorder();
                            break;

                        case 3:
                            System.out.println("INORDER---->");
                            tree.inorder();
                            break;
                        case 4:
                            System.out.println("POSTORDER---->");
                            tree.postorder();
                            break;


                        case 5:
                            exit=true;
                            break;

                    }
               }

    }

}
