package collection_.collectionFrameWork.set;

public class _1_SetDefinition {
    /*
    2. SET (setis)- Interface: (Set of unique things) A Set is a Collection that cannot contain duplicate elements.
     Set interface only allows a single null value.
        When there is a dropdown and you know there should won’t be any duplicate elements,
        then Set is the best one to use because it doesn’t allow duplicates.
        Classes implementing Set are HashSet, LinkedHashSet and TreeSet.
   ● HashSet - class:
        ○ It doesn’t maintain any order, the elements would be returned in any random order.
        ○ It doesn’t allow duplicates. If we try to add a duplicate element in HashSet, the old value would be overwritten. (no duplicate value)
        ○ It allows null values however if we insert more than one null, it would still return only one null value.
   ● LinkedHashSet - class:
        ○ It maintains the insertion order. Elements get sorted in the same sequence in which they have been added to the Set.
        ○ It is basically an ordered version of HashSet so you can use it when you care about the insertion order.
   ● TreeSet - class: implementing SortedSet Interface
        ○ TreeSet is similar to HashSet except that it sorts the elements in the ascending order while
         HashSet doesn’t maintain any order.(not null)
        ○ It is substantially slower than HashSet.

     */
}
