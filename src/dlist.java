public class dlist <bloob> {
    private StuffNode first;
    private int size;

    public class StuffNode {
        public bloob item;
        public StuffNode next;

        public StuffNode(bloob i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    public dlist(bloob x) {
        first = new StuffNode(x, null);
        size = 1;
    }

    /**
     * Adds x to the front of the list.
     */
    public void addFirst(bloob x){
        first = new StuffNode(x, first);
        size += 1;
    }

    /** Return the first item in the list.*/
    public bloob getFirst(){
        return first.item;
    }

    /** Add an item to the end of the list.*/
    public void addLast(bloob x){
        size +=1;
        StuffNode p = first;
        while (p.next != null){
            p=p.next;
        }
        p.next = new StuffNode(x,null);
    }

    public int size(){
        return size;
    }

}
