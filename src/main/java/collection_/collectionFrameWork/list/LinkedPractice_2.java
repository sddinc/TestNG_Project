package collection_.collectionFrameWork.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedPractice_2 {
    public static void main(String[] args) {
        // Declare linked list

        LinkedList l = new LinkedList();
        l.add("x");
        l.add("y");
        l.add("z");
        l.add("a");
        l.add("b");
        l.add("c");

        LinkedList newL = new LinkedList();
        newL.addAll(l);
        System.out.println("newL = " + newL);
        Collections.sort(newL);
        System.out.println("short==> " + newL);

        Collections.sort(newL,Collections.reverseOrder());

        System.out.println("reverse order==>  " + newL);

        Collections.shuffle(newL);

        System.out.println("After shuffling==>  " + newL);
    }
}
