/**
 * @author Norris Chen
 */
public class RemoveFirst<E> extends DoublyLinkedList<E> {
    @Override
    public E removeFirst() {
        // Does not remove
        return super.get(super.size() - 1);
    }
}
