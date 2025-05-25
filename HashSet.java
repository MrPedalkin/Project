Пользовательский HashSet
public class CustomHashSet<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    private Node<E>[] table;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean add(E element) {
        if (contains(element)) return false;
        
        int hash = hash(element);
        int index = indexFor(hash, table.length);
        
        table[index] = new Node<>(element, table[index]);
        size++;
        
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }
        
        return true;
    }

    // Другие методы...
}
