package org.snut.generic;

import java.util.*;

/**
 * @author curtis
 * @date 2021/11/28
 * @description
 **/
public class GenericTest {
    public static void main(String[] args) {

//        AllGeneric<String> ag = new AllGeneric<>("Hello World!");
//        System.out.println(ag.getThis().getClass());
//
//        AllGeneric<Integer> ag2 = new AllGeneric<>(1000);
//        System.out.println(ag2.getThis().getClass());

        HashSet<GenericClass> set = new HashSet<>();
        set.add(new GenericClass("nameA", 19));
        set.add(new GenericClass("nameB", 20));
        set.add(new GenericClass("nameC", 21));
        for (GenericClass genericClass : set) {
            System.out.println(genericClass.toString());
        }

        HashMap<String, GenericClass> map = new HashMap<>();
        map.put("nameA", new GenericClass("nameA", 19));
        map.put("nameB", new GenericClass("nameB", 20));
        map.put("nameC", new GenericClass("nameB", 21));

        Set<Map.Entry<String, GenericClass>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, GenericClass>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, GenericClass> next = iterator.next();
            System.out.println(next.getKey() +"==="+ next.getValue().toString());
        }

    }
}
