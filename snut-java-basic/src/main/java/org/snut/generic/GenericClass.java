package org.snut.generic;

import lombok.Data;

/**
 * @author curtis
 * @date 2021/11/28
 * @description
 **/
@Data
public class GenericClass {

    private String name;

    private Integer age;

    public GenericClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
