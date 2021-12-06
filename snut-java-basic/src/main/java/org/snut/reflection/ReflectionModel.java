package org.snut.reflection;

/**
 * @author curtis
 * @date 2021/12/4
 * @description
 **/
public class ReflectionModel {

    public ReflectionModel() {
    }

    public ReflectionModel(String name) {
        this.name = name;
    }

    public String name = "ReflectionModel";

    public void Hello() {
        System.out.println("Hello：" + name);
    }
}
