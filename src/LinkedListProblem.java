import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProblem {
    public static void main(String[] args) {
        System.out.println("LinkedList Problem");

        LinkedList<String> list = new LinkedList<String>();

        list.add("70");

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
