package code.map_;

import java.util.*;

//Write a method that can return the minimum value from ta map (DO NOT use sort method)
public class MinValue {


    public  static  int  minValue( Map<String,Integer> map  ) {
        Set<Integer> sm = new TreeSet<>(map.values());
        List<Integer> list=new LinkedList<>(sm);

        return list.get(0);

    }
}
