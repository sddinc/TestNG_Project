package collection_.collectionFrameWork.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedPractice {
    public static void main(String[] args) {
        // Declare linked list

        LinkedList l=new LinkedList();
        l.add(100);
        l.add("welcome");
        l.add(10.5);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println("l = " + l);
        System.out.println("l.size() = " + l.size());
        l.remove(3);
        System.out.println("After removing new l:  " + l);
        l.remove("welcome");
        System.out.println("After remove obj " + l);

        //iterator

        Iterator it=l.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }




     }
}
