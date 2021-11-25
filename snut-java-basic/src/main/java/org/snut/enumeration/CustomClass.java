package org.snut.enumeration;

import lombok.Data;
import lombok.Getter;

/**
 * @author curtis
 * @date 2021/11/23
 * @description 自定义类实现枚举
 **/
@Data
public class CustomClass {

    public final static CustomClass SPRING = new CustomClass("spring","春天");
    public final static CustomClass SUMMER = new CustomClass("summer","夏天");
    public final static CustomClass AUTUMN = new CustomClass("autumn","秋天");
    public final static CustomClass WINTER = new CustomClass("winter","冬天");

    private String Season;

    private String Description;

    private CustomClass(String season, String description) {
        Season = season;
        Description = description;
    }
}
