public class slist {
    /** Nested class,static meaning nothing within IntNode class refer to outside of class*/
    public static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;

    /** If the new SLList is empty, use a sentinel, the first node is always sentinel.next, the sentinel here is (8,null)*/
    public slist(int x){
        first = new IntNode(8,null);
        first.next = new IntNode(x, null);
        size = 1;
    }

    public slist(){
        first = new IntNode(8,null);
        size = 0;
    }
    /** Adds x to the front of the list. */
    public void addFirst(int x){
        first.next = new IntNode(x, first.next);
        size+= 1;
    }
    /** Return the first item in the list. */
    public int getFirst(){
       return first.next.item;
    }
    /** Add x to the end of the list. */
    public void addLast(int x){
        IntNode p = first;
        while (p.next!= null){
            p=p.next;
        }
        p.next = new IntNode(x,null);
        size +=1;
    }
    /** Return the size of the list. Method one.
     private static int size(IntNode L){
     if(L.next==null){
     return 1;
     }
     return(1+size(L.next));
     }*/

    /** Return the size of the list with caching method*/
    public int size(){
        return size;
    }


    public static void main(String[] args){
        /* Create a list of one integer, namely 10 */
    }



}
