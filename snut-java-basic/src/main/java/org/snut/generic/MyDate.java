package org.snut.generic;

import lombok.Data;

/**
 * @author curtis
 * @date 2021/11/29
 * @description
 **/
@Data
public class MyDate {

    private String year;

    private String month;

    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
