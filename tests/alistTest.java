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

    @Test
    public void insert() {
        alist<String> K = new alist<>();
        K.addLast("Can");
        K.addLast("insert");
        K.addLast("a");
        K.addLast("string");
        K.insert("I",1);
        String B = K.get(1);
        assertEquals(5, K.getSize());
        assertEquals("string", K.get(K.getSize()-1));
    }

    @Test
    public void addFirst() {
        alist<Integer> L = new alist<>();
        L.addFirst(10);
        L.addFirst(9);
        L.addFirst(8);
        L.addFirst(7);
        L.addLast(0);
        int B = L.get(1);
        assertEquals(8, B);
        assertEquals(5,L.getSize());
    }

    @Test
    public void get() {
    }

    @Test
    public void getSize() {
    }
}