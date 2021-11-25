package org.snut.enumeration;

/**
 * @author curtis
 * @date 2021/11/23
 * @description 枚举
 **/
public class EnumTest {

    public static void main(String[] args) {

        /**
         * enum类默认集成Enum,不能再集成其他类，可以实现接口
         */

        //自定义类实现枚举效果
        //System.out.println(CustomClass.WINTER.getSeason());
        //System.out.println(CustomClass.WINTER.getDescription());

        //获取当前枚举的名称
        System.out.println(OrderTypeEnum.DBCK.name());
        //获取当前枚举顺序，从0开始
        System.out.println(OrderTypeEnum.THCK.ordinal());
        //含有定义的所有枚举对象
        OrderTypeEnum.values();
        //根据输入的常量值去枚举中找，找到返回，找不到报错
        OrderTypeEnum xsck = OrderTypeEnum.valueOf("XSCK");
        System.out.println(xsck.getTypeDesc());

        //比较两个常量的序号
        //this.ordinal()-other.ordinal()
        System.out.println(OrderTypeEnum.XSCK.compareTo(OrderTypeEnum.QTCK));

        //System.out.println(SeasonEnum.valueOf("调拨出库"));
        //System.out.println(OrderTypeEnum.getDescByCode("XSCK"));
        //System.out.println(OrderTypeEnum.DBCK.getTypeDesc());

        System.out.println("===所有星期的信息如下===");
        for (WeekEnum value : WeekEnum.values()) {
            System.out.println(value.getDaysDesc());
        }
    }
}
