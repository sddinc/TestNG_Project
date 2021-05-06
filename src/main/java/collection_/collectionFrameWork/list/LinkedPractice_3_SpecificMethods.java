package collection_.collectionFrameWork.list;

import java.util.LinkedList;

public class LinkedPractice_3_SpecificMethods {
    public static void main(String[] args) {
        // Declare linked list

        LinkedList l = new LinkedList();
        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");
        System.out.println("l = " + l);
        l.addFirst("Tiger");
        l.addLast("Monkey");
        System.out.println("After addFirst and addLast methods = " + l);
        System.out.println(l.getFirst());
        l.removeFirst();
        System.out.println("l = " + l);
        l.removeLast();
        System.out.println("l = " + l);
    }
}
