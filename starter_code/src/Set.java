/**
 * @author Norris Chen
 */
public class Set<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        // Does not set element, but instead returns old value 
        return get(index);
    }
}
