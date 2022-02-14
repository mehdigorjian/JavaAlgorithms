package linkedlist;

interface List<T extends Comparable<T>> {
    abstract public void insert(T data, String flag);

    abstract public void remove(T data);

    abstract public void traverse();

    abstract public Node<T> reverse();

    abstract public int size();
}