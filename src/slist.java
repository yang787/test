public class slist <bloob> implements List61B<bloob> {
    /** Nested class,static meaning nothing within Node class refer to outside of class*/
    public class Node{
        public bloob item;
        public Node next;

        public Node(bloob i, Node n){
            item = i;
            next = n;
        }
    }

    private Node first;
    private int size;

    /** If the new SLList is empty, use a sentinel, the first node is always sentinel.next, the sentinel here is (8,null)*/
    public slist(bloob x){
        first = new Node(null,null);
        first.next = new Node(x, null);
        size = 1;
    }

    public slist(){
        first = new Node(null,null);
        size = 0;
    }

    /** Inserts the item into the given position in the list.
     * If position is greater than the size of the list,
     * inserts at the end instead*/
    @Override
    public void insert(bloob item, int position){
        Node p =first;
        while (position >1 && p.next!=null){
            position--;
            p=p.next;
        }
        Node newNode = new Node(item, p.next);
        p.next = newNode;
    }

    /** Adds x to the front of the list. */
    @Override
    public void addFirst(bloob x){
        first.next = new Node(x, first.next);
        size+= 1;
    }
    /** Return the first item in the list. */
    public bloob getFirst(){
       return first.next.item;
    }
    /** Add x to the end of the list. */
    @Override
    public void addLast(bloob x){
        Node p = first;
        while (p.next!= null){
            p=p.next;
        }
        p.next = new Node(x,null);
        size +=1;
    }
    /** Return the back node of our list*/
    public Node getLastNode(){
        Node p= first;
        while (p.next!=null){
            p=p.next;
        }
        return p;
    }
    /** Return the last item*/
    @Override
    public bloob getLast(){
        Node last = getLastNode();
        return last.item;
    }
    /** Get the i th item in the list. */
    @Override
    public bloob get(int i){
        return get(i,first.next);
    }
    private bloob get(int i, Node p){
        if(i==0){
            return p.item;
        }
        return get(i-1, p.next);
    }
    /** Delete and return the last item. */
    @Override
    public bloob removeLast(){
        Node last = getLastNode();
        if(last==first){
            return null;
        }
       Node p = first;
        while (p.next!= last){
            p=p.next;
        }
        p.next=null;
        size -=1;
        return last.item;
    }

    /** Return the size of the list. Method one.
     private static int size(Node L){
     if(L.next==null){
     return 1;
     }
     return(1+size(L.next));
     }*/

    /** Return the size of the list with caching method*/
    @Override
    public int getSize(){
        return size;
    }


    public static void main(String[] args){
        /* Create a list of one integer, namely 10 */
    }



}
