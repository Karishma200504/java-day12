import java.util.*;
public class acceptlinklistvalue{
    public static void main(String args[]){
        //accepting values into alinkedlist
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int s=sc.nextInt();
            a.addFirst(s);
        } 
        for(int i=0;i<size;i++)
        System.out.println(a.get(i)+" ");
    }
}