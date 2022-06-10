import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProblem {
    public static void main(String[] args) {
        System.out.println("LinkedList Problem");

        LinkedList<String> list = new LinkedList<>();

        list.add(0, "56");
        list.add(1, "30");
        list.add(2, "70");

        list.removeFirst();

        list.add(0, "56");

        list.removeLast();

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }

        String key = "30";
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            if (value == key) {
                System.out.println("Value " + key + " found at Node: " + i);
            }
        }
    }
}
