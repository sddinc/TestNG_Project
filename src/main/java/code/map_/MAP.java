package code.map_;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.*;
import java.util.stream.Collectors;

class MAP {
    public static void main(String[] args) {


    List<String> list = new LinkedList<>(Arrays.asList(
            "storage-bucket/a/2018",
            "storage-bucket/a/2019",
            "storage-bucket/a/2020",
            "storage-bucket/b/2020",
            "storage-bucket/c/2019",
            "storage-bucket/c/2020",
            "storage-bucket/c/2020",
            "storage-bucket/c/2020",
            "storage-bucket/c/2020",
            "storage-bucket/c/2020",
            "storage-bucket/z/2020"));


    Map<String, List<String>> filesByDir = list.parallelStream().collect(Collectors.groupingBy(filePath -> filePath.split("/")[1]));

    //System.out.println(filesByDir);
}

    public Map<String, List<String>> getData(List<String> list) {
        Set<String> key = new HashSet<>();
        for (String k : list) {
            key.add(k.substring(15, 16));
        }
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String mapKey : key) {
            map.put(mapKey, list.stream().filter(p -> p.contains("/" + mapKey + "/")).collect(Collectors.toList()));
        }
        return map;
    }

}
