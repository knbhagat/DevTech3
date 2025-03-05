import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = true;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get

    /**
     * @author grayson_replace_this
     * @see GetAtOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    // Tests for getAtIndex

    /**
     * @author Norris Chen
     * @see GetAtIndex
     */
    @Test
    public void testGetAtIndex() {
        if (SHOULD_FAIL) list = new GetAtIndex<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(1, list.get(0));
        assertEquals(3, list.get(2));
    }

    // Tests for getFirst

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testGetFirst() {

        list.addLast(1);
        list.addLast(2); 
        assertEquals(1, list.getFirst());
        assertEquals(list.size(), 2);
        list.addFirst(3);
        assertEquals(3, list.getFirst());
        assertEquals(list.size(), 3);
    }

    // Tests for getLast

    /**
     * @author Norris Chen
     * @see GetLast
     */
    @Test
    public void testGetLast() {
        if (SHOULD_FAIL) list = new GetLast<>();

        list.addLast(1);
        list.addLast(2); 
        assertEquals(2, list.getLast());

        list.addLast(3);
        assertEquals(3, list.getLast());
    }

    // Tests for isEmpty

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testIsEmptyWhenCreated() {

        assertEquals(list.isEmpty(), true);

        list.addFirst(0);
        assertEquals(list.isEmpty(), false);

        list.removeFirst();
        assertEquals(list.isEmpty(), true);
    }

    // Tests for add

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {

        list.add(0, 1);
        list.add(1, 2);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(3, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 3));
    }

    // Tests for addFirst

    /**
     * @author Norris Chen
     * @see AddFirstAddsElement
     */
    @Test
    public void testAddFirstAddsElement() {
        if (SHOULD_FAIL) list = new AddFirstAddsElement<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3); // 3 2 1

        assertEquals(list.size(), 3);
        assertEquals(list.get(2), 1);
        assertEquals(list.get(0), 3);
    }

    // Tests for addLast

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testAddLastAddsElement() {

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(list.size(), 3);
        assertEquals(list.get(2), 3);
        assertEquals(list.get(0), 1);
        assertEquals(list.get(1), 2);
    }

    // Tests for remove

    /**
     * @author Norris Chen
     * @see RemoveAtIndex
     */
    @Test
    public void testRemoveAtIndex() {
        if (SHOULD_FAIL) list = new RemoveAtIndex<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(list.remove(2), 3);
        assertEquals(list.size(), 2);
        assertEquals(list.remove(0), 1);
        assertEquals(list.size(), 1);
        assertEquals(list.remove(0), 2);
        assertEquals(list.isEmpty(), true);
    }

    // Tests for removeFirst

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testRemoveFirst() {

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        assertEquals(list.removeFirst(), 3);
        assertEquals(list.size(), 2);
        assertEquals(list.removeFirst(), 2);
        assertEquals(list.size(), 1);
        assertEquals(list.removeFirst(), 1);
        assertEquals(list.isEmpty(), true);
    }

    // Tests for removeLast

    /**
     * @author Norris Chen
     * @see RemoveLast
     */
    @Test
    public void testRemoveLast() {
        if (SHOULD_FAIL) list = new RemoveLast<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(list.removeLast(), 3);
        assertEquals(list.size(), 2);
        assertEquals(list.removeLast(), 2);
        assertEquals(list.size(), 1);
        assertEquals(list.removeLast(), 1);
        assertEquals(list.isEmpty(), true);
    }


    // Tests for size

    /**
     * @author Norris Chen
     * @see Size
     */
    @Test
    public void testSize() {
        if (SHOULD_FAIL) list = new Size<>();

        list.addLast(3);

        assertEquals(list.size(), 1);

        list.addLast(2);
        list.addLast(1); // 3 2 1

        assertEquals(list.size(), 3);

        list.removeLast();
        assertEquals(list.size(), 2);
    }

    // Tests for set

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testSet() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.set(1, 4);

        assertEquals(list.get(1), 4);
        assertEquals(list.size(), 3);
        assertEquals(list.get(0), 1);
        assertEquals(list.get(2), 3);
    }
}