public class VengefulSLList<Item> extends slist<Item> {
    slist<Item> deletedItems;

    public VengefulSLList(){
        super();
        deletedItems = new slist<Item>();
    }

    public VengefulSLList(Item x){
        super(x); // super() is called for constructor, default is with no argument, to include argument need to specify
        deletedItems = new slist<Item>();// noted that the deletedItems is a nested slist in a slist (VengefulSLList)
    }

    @Override
    public Item removeLast(){
        Item x = super.removeLast();// to call a function in the mother class use super.function()
        deletedItems.addLast(x);
        return x;
    }

    /** Print deleted items*/
    public void printLostItems(){
        deletedItems.print();
    }

    public static void main (String[] args){
        VengefulSLList<Integer> vs1 = new VengefulSLList<>(0);
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(6);
        vs1.addLast(7);

        vs1.removeLast();
        vs1.removeLast();

        System.out.print("The fallen are: ");
        vs1.printLostItems();
        System.out.print ("the Size is: ");
        System.out.print(vs1.getSize());
    }
}
