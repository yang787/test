public class RotatingSlist<Item> extends slist<Item> {
    /** Rotates list to the right. */
    public void rotateRight(){
        Item x= removeLast();
        addFirst(x);
    }

    public static void main(String[] args){
        RotatingSlist<Integer> rs1 = new RotatingSlist<>();
        rs1.addLast(10);
        rs1.addLast(11);
        rs1.addLast(12);
        rs1.addLast(13);

        /* Should be: [13,10,11,12]*/
        rs1.rotateRight();
        rs1.print();
    }
}
