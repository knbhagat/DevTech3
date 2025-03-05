/**
 * @author Krishaan Bhagat
 */
public class RemoveAtIndex<E> extends DoublyLinkedList<E> {
    @Override
    public E remove(int index) {
        // does not remove index
        return super.get(index);
    }
}

