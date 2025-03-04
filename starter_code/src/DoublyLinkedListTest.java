import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

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

    /**
     * @author
     * @see
     */
    @Test
    public void testGetAtIndex() {
        fail("Not yet implemented");
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

        list.addFirst(3);
        assertEquals(3, list.getFirst());
    }

    // Tests for getLast

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
     * @author
     * @see
     */
    @Test
    public void testAddFirstAddsElement() {
        fail("Not yet implemented");
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
    }

    // Tests for remove

    /**
     * @author
     * @see
     */
    @Test
    public void testRemoveAtIndex() {
        fail("Not yet implemented");
    }

    // Tests for removeFirst

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testRemoveFirst() {
        
    }

    // Tests for removeLast

    // Tests for size

    // Tests for set

    /**
     * @author Krishaan Bhagat
     * @see
     */
    @Test
    public void testSet() {
        
    }
}