// Use GitBash with commend 'time java ...' to show the run time for SpeedTestAlist.


public class SpeedTestAlist {
    public static void main(String[] args){
        alist<Integer> L = new alist();
        int i = 0;
        while (i<100000){
            L.addLast(i);
            i = i+1;
        }
    }
}
