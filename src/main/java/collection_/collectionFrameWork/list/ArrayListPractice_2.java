package collection_.collectionFrameWork.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice_2 {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList();

        al.add("x");
        al.add("y");
        al.add("z");
        al.add("a");
        al.add("b");
        al.add("c");

        ArrayList<String> al2=new ArrayList();
        al2.addAll(al);
        System.out.println("al2 = " + al2);
        ArrayList<String> remove=new ArrayList(Arrays.asList("a","b","23"));
        al2.removeAll(remove);
        System.out.println("After removeAll al2 = " + al2);

        Collections.sort(al);
        System.out.println("after short al = " + al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("reverse al = " + al);

        Collections.shuffle(al);
        System.out.println("after shuffle al = " + al);

    }
}
