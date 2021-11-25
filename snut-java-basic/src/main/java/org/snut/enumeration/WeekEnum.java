package org.snut.enumeration;

import lombok.Getter;

/**
 * @author curtis
 * @date 2021/11/23
 * @description
 **/
@Getter
public enum WeekEnum {

    SUNDAY("SUNDAY", "星期日"),
    MONDAY("MONDAY", "星期一"),
    TUESDAY("TUESDAY", "星期二"),
    WEDNESDAY("WEDNESDAY", "星期三"),
    THURSDAY("THURSDAY", "星期四"),
    FRIDAY("FRIDAY", "星期五"),
    SATURDAY("SATURDAY", "星期六");

    private String daysCode;
    private String daysDesc;

    WeekEnum(String daysCode, String daysDesc) {
        this.daysCode = daysCode;
        this.daysDesc = daysDesc;
    }
}
