public class dlistLauncher {
    public static void main(String[] args){
        dlist<String> s1 = new dlist<>("bone");
        s1.addFirst("thugs");
        System.out.println(s1.getFirst());
    }
}
