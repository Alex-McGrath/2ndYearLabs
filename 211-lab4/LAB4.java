import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class LAB4 {
    public static void main(String args[]){
        LinkedBinaryTree<String> link = new LinkedBinaryTree<String>();

        Position<String> A = link.addRoot("A");
        //Parent A
        link.addLeft(A,"B");
        Position<String> B = link.left(A);

        Position<String> C = link.addRight(A,"C");

        //Parent B
        Position<String> E = link.addLeft(B,"E");

        Position<String> F = link.addRight(B,"F");
        //Parent E
        Position<String> N = link.addLeft(E,"N");

        //Parent F
        Position<String> I = link.addLeft(F,"I");

        Position<String> K = link.addRight(F,"K");

        //Parent C
        Position<String> G =link.addLeft(C,"G");

        Position<String> H = link.addRight(C,"H");

        printChildren(link, A);
        link.swapChildren(A);
        printChildren(link, A);
    
    }
    public static void printChildren(LinkedBinaryTree<String> link, Position<String> p){
        if(link.right(p)!= null){
            System.out.println("The right child of "+ p.getElement() + " is "+ link.right(p).getElement());
        }
        if(link.left(p) != null){
            System.out.println("The left child of "+ p.getElement() + " is "+ link.left(p).getElement());
        }
        
    }
}

