package org.snut.generic;

import org.junit.jupiter.api.Test;

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
            System.out.println(next.getKey() + "===" + next.getValue().toString());
        }

        System.out.println("===================");

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("张三", "司机", new MyDate("1990", "02", "27")));
        list.add(new Employee("李四", "老师", new MyDate("1982", "10", "15")));
        list.add(new Employee("张三", "厨师", new MyDate("1993", "07", "02")));

        System.out.println("==========排序前=========");
        System.out.println(list);
        System.out.println("==========排序后=========");
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    int nCompare = o1.getName().compareTo(o2.getName());
                    if (nCompare == 0) {
                        return o1.getBirthday().toString().compareTo(o2.getBirthday().toString());
                    }
                    return nCompare;
                }
                return 0;
            }
        });
        System.out.println(list);
    }

    @Test
    public void test1(){
        System.out.println("XSXS");
    }
}
