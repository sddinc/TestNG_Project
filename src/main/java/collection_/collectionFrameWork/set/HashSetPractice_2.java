package collection_.collectionFrameWork.set;

import java.util.HashSet;

public class HashSetPractice_2 {
    public static void main(String[] args) {

        HashSet<Integer> evenNumber=new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("evenNumber = " + evenNumber);

        HashSet<Integer> numbers=new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(10);
        System.out.println("numbers = " + numbers);
        numbers.removeAll(evenNumber);
        System.out.println("numbers = " + numbers);
        
    }

}
