/**
 * @author Krishaan Bhagat
 */
public class Size<E> extends DoublyLinkedList<E> {
    @Override
    public int size() {
        // returns size - 1
        return super.size() - 1;
    }
}


