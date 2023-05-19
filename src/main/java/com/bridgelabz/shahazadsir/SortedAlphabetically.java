package com.bridgelabz.shahazadsir;

/*2. Create a method that takes a Map<String, String> and return the values as a separate array. Return the keys sorted alphabetically, and their corresponding values in the same order.
ExamplesgetValues({ "a": "1", "b": "2", "c": "3" } )
➞ ["1", "2", "3"]

getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
➞ ["Apple", "Microsoft", "Google"]

* */

import java.util.*;

public class SortedAlphabetically {

    public static String[] getValues(Map<String,String> map){
        List<String> val = new ArrayList<>(map.values());
        Collections.sort(val);

        return val.toArray(new String[0]);
//        System.out.println(val);

    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");

        System.out.println(Arrays.toString(getValues(map)));

        Map<String,String> map1 = new HashMap<>();
        map1.put("a","Apple");
        map1.put("b","Microsoft");
        map1.put("c","Google");

        System.out.println(Arrays.toString(getValues(map1)));


    }
}
