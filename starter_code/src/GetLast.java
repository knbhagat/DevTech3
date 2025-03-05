/**
 * @author Krishaan Bhagat
 */
public class GetLast<E> extends DoublyLinkedList<E> {
    @Override
    public E getLast() {
        // always returns the first index
        return super.get(0);
    }
}

