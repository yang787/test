import org.junit.Test;

import static org.junit.Assert.*;

public class slistTest {

    @Test
    public void getFirst() {
        slist L = new slist(10);
        L.addFirst(5);
        L.addLast(6);
        slist K = new slist();
        K.addLast(5);
        assertEquals(5, L.getFirst());
    }

    @Test
    public void insert() {
    }

    @Test
    public void addFirst() {
    }

    @Test
    public void addLast() {
    }

    @Test
    public void getLastNode() {
    }

    @Test
    public void getLast() {
    }

    @Test
    public void get() {
        slist s = new slist<>(10);
        s.addFirst(5);
        s.addFirst(4);
        s.addFirst(3);
        int k = (int) s.get(3);
        assertEquals(10,k);

    }

    @Test
    public void getSize() {
    }

    @Test
    public void main() {
    }

    @Test
    public void removeLast() {
        slist s = new slist<>(10);
        s.addFirst(5);
        s.addFirst(4);
        s.addFirst(3);
        int k = (int) s.removeLast();
        assertEquals(10,k);
    }
}