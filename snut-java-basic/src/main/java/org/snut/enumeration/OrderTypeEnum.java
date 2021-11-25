package org.snut.enumeration;

/**
 * @author curtis
 * @date 2021/11/23
 * @description
 **/
public enum OrderTypeEnum {

    XSCK("xsck", "销售出库"),
    DBCK("dbck", "调拨出库"),
    THCK("thck", "退货出库"),
    QTCK("qtck", "其他出库");

    /**
     * 单据类型编码
     */
    private String typeCode;

    /**
     * 单据类型名称
     */
    private String typeDesc;

    OrderTypeEnum(String typeCode, String typeDesc) {
        this.typeCode = typeCode;
        this.typeDesc = typeDesc;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public static String getDescByCode(String typeCode) {

        for (OrderTypeEnum item : values()) {

            if (item.getTypeCode().equals(typeCode)) {
                return item.typeDesc;
            }
        }
        return "";
    }
}

