package code.arrayList_;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?

 */
public class Remove_all_duplicates_from_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println("aList = " + aList);
        System.out.println("uqArr(aList) = " + uqArr(aList));
    }

    public static ArrayList<String> uqArr(ArrayList<String> list) {
        Set<String> stringSet = new LinkedHashSet<>(list);
        list = new ArrayList<>(stringSet);
        return list;

    }



}
