package org.snut.generic;

/**
 * @author curtis
 * @date 2021/11/28
 * @description
 **/
public class AllGeneric<T> {

    T t;

    public AllGeneric(T t) {
        this.t = t;
    }

    public T getThis(){
        return t;
    }
}
