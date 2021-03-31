//        0 1  2 3 4 5 6 7 ..
//items: [6 9 -1 0 0 0 0 0 0 0 ...]
//size: 3

/* Invariants:
addLast: The next item we want to add, will go into position size
getLast: the item we want to return is in position size -1
size: The number of items in the list should be size.
*/


public class alist<item> {
    private item[] items;
    private int size;

    /** Creates an empty list.*/
    public alist(){
        items = (item[]) new Object[100];
        size = 0;
    }

    /** Resize when size is larger than initial 100.*/
    private void resize(int capacity){
        item[] a = (item[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    /** Inserts X into the back of the list.
     * Instead of resize(size+factor), using resize(size*factor) would improve the memory performance*/
    public void addLast(item x){
        if (size == items.length){
            resize(size*5);
        }
        items[size] = x;
        size += 1;
    }

    /**Return the item from the back of the list*/
    public item getLast(){
        return items[size-1];
    }

    /** Remove the last item of the list */
    public item removeLast(){
        item x = getLast();
        items[size-1] = null;
        size = size-1;
        return x;
    }

    /** Return Size*/
    public int getSize(){
        return size;
    }


}
