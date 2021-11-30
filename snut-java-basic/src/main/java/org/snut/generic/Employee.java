package org.snut.generic;

import lombok.Data;

/**
 * @author curtis
 * @date 2021/11/29
 * @description
 **/
@Data
public class Employee {

    private String name;

    private String occupation;

    private MyDate birthday;

    public Employee(String name, String occupation, MyDate birthday) {
        this.name = name;
        this.occupation = occupation;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "    " +
                "职位：" + occupation + "    " +
                "生日：" + birthday + '\n';
    }
}
