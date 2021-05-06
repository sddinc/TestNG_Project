package collection_.collectionFrameWork.set;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 2. SET (setis)- Interface: (Set of unique things) A Set is a Collection that cannot contain duplicate elements.
 * Set interface only allows a single null value.
 * When there is a dropdown and you know there should won’t be any duplicate elements,
 * then Set is the best one to use because it doesn’t allow duplicates.
 * Classes implementing Set are HashSet, LinkedHashSet and TreeSet. ● HashSet - class:
 * ○ It doesn’t maintain any order, the elements would be returned in any random order.
 * ○ It doesn’t allow duplicates. If we try to add a duplicate element in HashSet, the old value would be overwritten. (no duplicate value)
 * ○ It allows null values however if we insert more than one null, it would still return only one null value.
 */

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet hs = new HashSet();// default capacity 16 Loaf Factir 0.75

//        HashSet<Integer> hs=new HashSet();
        hs.add(100);
        hs.add("welcome");
        hs.add(1000.25);
        hs.add('a');
        hs.add(true);

        hs.add(null);
        System.out.println("hs = " + hs);

        System.out.println("hs.contains(\"welcome\") = " + hs.contains("welcome"));

//        for (Object each:hs) {
//            System.out.println("each = " + each);
//
//        }
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }

}
