package collection_.collectionFrameWork.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListPractice {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 5, 2, 6};
        ArrayList <Integer> arrayList = new ArrayList(Arrays.asList(arr));
        arrayList.add(2);
        arrayList.add(1, 10);
        arrayList.set(0, 100);
        System.out.println(arrayList.contains(2));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        //Declare ArrayList
        ArrayList al = new ArrayList();

        // Add new Element to the arrayList
        al.add(100);
        al.add("welcome");
        al.add(10.5);
        al.add('A');
        al.add(true);
        System.out.println("al = " + al);
        System.out.println("Size of the arrayList: " + al.size());

        al.remove(1);
        System.out.println("al = " + al);

        al.add(3, "Selcuk");

        System.out.println("al = " + al);

        //retreive specific element 
        System.out.println("al.get(2) = " + al.get(2));
        // change element
        al.set(2, "C#");
        System.out.println("al = " + al);
        //search element
        System.out.println("al.contains(\"C#\") = " + al.contains("C#"));
        System.out.println("al.contains(\"C++\") = " + al.contains("C++"));
        System.out.println("al.isEmpty() = " + al.isEmpty());
/*
        // for loop
        System.out.println("loop");
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }

        // for each
        System.out.println("for each");
        for (Object each:al) {
            System.out.println(each);
        }
        //iterator
        System.out.println("iterator");
        Iterator it=al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // stream
        System.out.println("stream");

        al.stream().forEach(p-> System.out.println(p));


*/

    }

}
