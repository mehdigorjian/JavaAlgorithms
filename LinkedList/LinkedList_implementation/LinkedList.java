package linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {
    private Node<T> head;
    private int numOfItems = 0;

    public LinkedList() {
        System.out.println("LinkedList initialized!");
    }

    public Node<T> getRoot() {
        return this.head;
    }

    @Override
    public void insert(T data, String flag) {
        ++this.numOfItems;
        if (this.head == null)
            this.head = new Node<>(data);
        else if (flag == "begin") {
            insertBegining(data);
        } else if (flag == "end") {
            insertEnd(data, this.head);
        }
    }

    private void insertBegining(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    private void insertEnd(T data, Node<T> node) {
        Node<T> newNode = new Node<>(data);
        if (node.getNextNode() == null) {
            node.setNextNode(newNode);
            newNode.setNextNode(null);
        } else {
            insertEnd(data, node.getNextNode());
        }
    }

    @Override
    public void remove(T data) {
        --this.numOfItems;
        if (this.head == null)
            return;
        if (this.head.getData().compareTo(data) == 0)
            this.head = this.head.getNextNode();
        else {
            removeAt(data, this.head, this.head.getNextNode());
        }
    }

    private void removeAt(T data, Node<T> previousNode, Node<T> node) {
        while (node != null) {
            if (node.getData().compareTo(data) == 0) {
                previousNode.setNextNode(node.getNextNode());
                node = null;
                return;
            }
            previousNode = node;
            node = node.getNextNode();
        }
    }

    public Node<T> middleNode() {
        Node<T> lPointer = head, rPointer = this.head;
        while ((rPointer.getNextNode() != null) && (rPointer.getNextNode().getNextNode() != null)) {
            lPointer = lPointer.getNextNode();
            rPointer = rPointer.getNextNode().getNextNode();
        }
        return lPointer;
    }

    @Override
    public Node<T> reverse() {
        Node<T> previousNode = null;
        Node<T> currentNode = this.head;
        Node<T> nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);

            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.head = previousNode;
        return this.head;
    }

    @Override
    public void traverse() {
        if (this.head == null)
            return;
        Node<T> newNode = this.head;
        while (newNode != null) {
            System.out.print(newNode);
            newNode = newNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.numOfItems;
    }
}