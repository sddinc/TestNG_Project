package com.trycloud.tests.tasks;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    @Test
    public void streamFilter() {

        int count = (int) Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(p -> p.startsWith("A")).count();
        System.out.println("count = " + count);
        Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(p -> p.startsWith("A")).forEach(p -> System.out.println(p));

        long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(p ->
                {
                    p.startsWith("A");
                    return true;
                }
        ).count();
        System.out.println("d = " + d);

        //print name length greater than 4
        Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(p -> p.length() > 4).forEach(p -> System.out.println("name length greater than 4 = " + p));
        Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(p -> p.length() > 4).limit(1).forEach(p -> System.out.println("first result which is name length greater than 4 = " + p));

    }

    @Test
    public void streamMap() {
        //print names which has last letter as "a" with Uppercase
        Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram", "Rama").filter(p -> p.endsWith("a")).map(p -> p.toUpperCase()).forEach(p -> System.out.println("p = " + p));
        //print names which have first letter as a with uppercase and sorted
        List<String> names = new ArrayList<>(Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram", "Rama"));

        names.stream().filter(p -> p.startsWith("A")).sorted().map(p -> p.toUpperCase()).forEach(p -> System.out.println(p));
        List<String> names1 = new ArrayList<>(Arrays.asList("Selcuk", "Elif", "Tahir", "Emir"));
        Stream<String> allNames = Stream.concat(names.stream(), names1.stream());
        boolean flag = allNames.anyMatch(p -> p.equalsIgnoreCase("adamass"));
        System.out.println("flag = " + flag);
    }

    @Test
    public void streamCollector(){
        List<String> names = new ArrayList<>(Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram", "Rama"));
        names.stream().filter(p->p.startsWith("A")).map(p->p.toUpperCase()).collect(Collectors.toList());

    }

    @Test
    public void removeDuplicationInArray(){
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] uniq=Arrays.stream(arr).distinct().sorted().toArray();
        System.out.println(Arrays.toString(uniq));
    }

    @Test
    public void test(){

    }
    /**

Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] nums) {
        return(int) Arrays.stream(nums).filter(p->p%2==0).count();

    }

    /**
     * Given an array length 1 or more of ints, return the difference between the largest and smallest
     * values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
     * methods return the smaller or larger of two values.
     * bigDiff([10, 3, 5, 6]) → 7
     * bigDiff([7, 2, 10, 9]) → 8
     * bigDiff([2, 10, 7, 2]) → 8
     */


    public int bigDiff(int[] nums) {
         int []array= {1, 2, 2, 3, 4, 4, 4, 5, 5};
     return Arrays.stream(nums).max().getAsInt()-Arrays.stream(nums).min().getAsInt();

    }
    /**
     * Return the "centered" average of an array of ints, which we'll say is the mean
     * average of the values, except ignoring the largest and smallest values in the array.
     * If there are multiple copies of the smallest value, ignore just one copy, and likewise
     * for the largest value. Use int division to produce the final average.
     * You may assume that the array is length 3 or more.
     * centeredAverage([1, 2, 3, 4, 100]) → 3
     * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
     * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */
//    public int centeredAverage(int[] nums) {
//
//
//    }
//

}