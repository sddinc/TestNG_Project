package code.arrayList_;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Remove_all_data_elements_that_are_equal_to_1 {
    public static void main(String[] args) {
        System.out.println("output = " + removeOne1(new LinkedList<>(Arrays.asList(1, 23, 45, 8))));


    }


    public static List<Integer> removeOne(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        for (Integer each : list) {
            if (each!= 1) {
                newList.add(each);
            }

        }
        return newList;

    }

    public static List<Integer> removeOne1(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();

        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            int num=it.next();
            if(num==1){
                newList.add(num);
            }
        }


        return newList;
    }

}
