/**
 * @author Norris Chen
 */
public class AddLastAddsElement<E> extends DoublyLinkedList<E> {
    @Override
    public void addLast(E e) {
        // Always adds first
        super.addFirst(e);
    }
}
