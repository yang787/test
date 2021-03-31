import org.junit.Test;

import static org.junit.Assert.*;

public class alistTest {

    @Test
    public void addLast() {
        alist A = new alist();
        A.addLast(10);
        A.addLast(5);
        assertEquals(5, A.getLast());
        assertEquals(2, A.getSize());
    }

    @Test
    public void getLast() {
    }

    @Test
    public void removeLast() {
        alist B = new alist();
        B.addLast(8);
        B.addLast(10);
        B.addLast(6);
        B.getLast();
        B.removeLast();
        assertEquals(10, B.getLast());

    }

}