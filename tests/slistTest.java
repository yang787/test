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
}