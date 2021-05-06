public interface List61B<item> {
    /** Inserts item into given position.*/
    public void insert(item x, int position);

    /** Inserts X into the back of the list.
     * Instead of resize(size+factor), using resize(size*factor) would improve the memory performance*/
    public void addLast(item x);
    /** Insert X into the front of the list.*/
    public void addFirst(item x);

    /**Return the item from the back of the list*/
    public item getLast();

    /** Return the item at n position on the list
     * position start from 0
     */
    public item get(int n);

    /** Remove the last item of the list */
    public item removeLast();

    /** Return Size*/
    public int getSize();

    /** Implementation inheritance, to print*/
    default public void print(){
        for (int i=0; i<getSize(); i+=1){
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }


}
