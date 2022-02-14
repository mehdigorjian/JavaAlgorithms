import linkedlist.*;

class MidElement<T extends Comparable<T>> {
    private LinkedList<T> lList;

    public MidElement(LinkedList<T> lList) {
        this.lList = lList;
    }

    public Node<T> mid() {
        Node<T> lPointer = lList.getRoot(), rPointer = lList.getRoot();
        while ((rPointer.getNextNode() != null) && (rPointer.getNextNode().getNextNode() != null)) {
            lPointer = lPointer.getNextNode();
            rPointer = rPointer.getNextNode().getNextNode();
        }
        return lPointer;
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        String flag = "begin";
        LinkedList<Integer> l = new LinkedList<>();
        l.insert(10, flag);
        l.insert(20, flag);
        l.insert(30, flag);
        l.insert(40, flag);
        l.insert(50, flag);
        l.insert(60, flag);
        l.insert(70, flag);
        l.insert(80, flag);
        l.insert(90, flag);
        l.insert(100, flag);
        // l.insert(110, flag);
        // l.insert(120, flag);

        l.traverse();
        System.out.println();
        // System.out.println(l.getRoot());
        // MidElement<Integer> m = new MidElement<>(l);
        // System.out.println(m.mid());
        l.reverse();
        l.traverse();
    }
}
