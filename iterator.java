import java.util.*;
class iterator{
    public static void main(String args[]){ 
    LinkedHashSet<String> a=new LinkedHashSet<>();
    a.add("hello");
    a.add("hello");
    a.add("students");
    a.add("rajesh");
    a.add("students");
    //printing using iterator
    Iterator itr=a.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+" ");
    }
}
}
