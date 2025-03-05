/**
 * @author Krishaan Bhagat
 */
public class GetAtIndex<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        // always returns index 0
        return super.get(0);
    }
}
