import java.util.*;
public class Linkedlistset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        System.out.println(a);
        a.remove("rajesh");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}