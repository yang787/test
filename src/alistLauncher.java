public class alistLauncher {
    public static void main(String[] args){
            alist B = new alist();
            B.addLast("ok");
            B.addLast("this");
            B.addLast("is");
            System.out.println(B.getLast());
            B.removeLast();
            System.out.println(B.removeLast());
    }
}
