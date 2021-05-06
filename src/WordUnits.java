public class WordUnits {
    /** Return the length of the longest word.*/
    public static String longest(List61B<String> list){
        int maxDex = 0;
        for(int i=0; i<list.getSize(); i+=1){
            String longest= list.get(maxDex);
            String thisString=list.get(i);
            if (thisString.length()>longest.length()){
                maxDex=i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args){
        alist<String> A = new alist<>();
        A.addLast("elk");
        A.addLast("are");
        A.addLast("watching");
        System.out.println(longest(A));
    }
}
