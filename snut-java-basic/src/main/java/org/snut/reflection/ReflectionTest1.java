package org.snut.reflection;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author curtis
 * @date 2021/12/4
 * @description
 **/
public class ReflectionTest1 {

    @Test
    public void Test1() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Properties p = new Properties();
        p.load(new FileInputStream("src\\main\\java\\org\\snut\\reflection\\re.properties"));
        String filePath = p.get("classname").toString();
        String methodName = p.get("method").toString();
        String field = p.get("field").toString();
        Class cls = Class.forName(filePath);

        //获取无参构造器
        Constructor constructor = cls.getConstructor();
        System.out.println("无参构造器===" + constructor);

        //获取有参构造器
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println("有参构造器===" + constructor1);

        //获取方法并执行
        Method method = cls.getMethod(methodName);
        method.invoke(cls.newInstance());

        //获取属性
        cls.getField(field);
        System.out.println("属性===" + cls.getField(field));
    }

    @Test
    public void Test2() throws ClassNotFoundException {

        /**
         * loadClass类加载
         * public Class<?> loadClass(String name) throws ClassNotFoundException {
         *             return loadClass(name, false);
         * }
         */
        // ReflectionModel model = new ReflectionModel();

        /**
         * 依然是通过Classloader类加载
         * public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         * }
         */
        Class aClass = Class.forName("org.snut.reflection.ReflectionModel");
        Class bClass = Class.forName("org.snut.reflection.ReflectionModel");
        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        /**
         * ****************************
         * aClass与bClass哈希值相同
         * 综上，某个类的Class类对象，在内存中只有一份，因此类只加载一次
         */
    }
}
