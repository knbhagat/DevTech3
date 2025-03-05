/**
 * @author Norris Chen
 */
public class IsEmptyWhenCreated<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        // Deliberately returns false, even when list is empty
        return false;
    }
}
