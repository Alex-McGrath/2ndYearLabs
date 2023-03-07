import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class LAB4 {
    public static void main(String args[]){
        LinkedBinaryTree<String> link = new LinkedBinaryTree<String>();

        Position<String> A = link.addRoot("A");
        //Parent A
        link.addRight(A,"C");
        Position<String>C = link.right(A);

        Position<String> H = link.addRight(C,"H");

        Position<String> G = link.addLeft(C,"G");

        

        //printChildren(link, A);
        //link.swapChildren(A);
        //printChildren(link, A);
        System.out.println(link.countExternalNodes(link.root()));
        System.out.println(link.pathLength(link.root(), 0));

    }
    public static void printChildren(LinkedBinaryTree<String> link, Position<String> p){
        if(link.right(p)!= null){
            System.out.println("The right child of "+ p.getElement() + " is "+ link.right(p).getElement());
        }
        if(link.left(p) != null){
            System.out.println("The left child of "+ p.getElement() + " is "+ link.left(p).getElement());
        }
                System.out.println(link.countExternalNodes(link.root()));

    }
}

