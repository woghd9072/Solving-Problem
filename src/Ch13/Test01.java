package Ch13;

public class Test01 {
    public static void main(String[] args) {
        SimpleLinearProbingHashTable ht=new SimpleLinearProbingHashTable(1000);
        ht.put("Korea");
        ht.put("Japan");
        System.out.println(ht.get("Korea"));
        System.out.println(ht.get("Japan"));
        System.out.println(ht.get("China"));
    }
}
