/**
 * @author Norris Chen
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
        // Ignores index bounds and inserts at end instead
        if (index > size || index < 0) {
            // Instead of throwing IndexOutOfBoundsException, it adds to the end
            super.addLast(element);
        } else {
            super.add(index, element);
        }
    }
}
