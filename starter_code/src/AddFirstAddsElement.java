/**
 * @author Krishaan Bhagat
 */
public class AddFirstAddsElement<E> extends DoublyLinkedList<E> {
    @Override
    public void addFirst(E e) {
        // always adds last
        super.addLast(e);
    }
}

