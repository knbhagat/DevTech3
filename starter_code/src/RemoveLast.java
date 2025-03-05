/**
 * @author Krishaan Bhagat
 */
public class RemoveLast<E> extends DoublyLinkedList<E> {
    @Override
    public E removeLast() {
        // Does not remove
        return super.get(super.size() - 1);
    }
}


