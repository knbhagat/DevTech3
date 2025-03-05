/**
 * @author Norris Chen
 */
public class GetFirst<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        // Does not return the first element
        return super.getLast();
    }
}
