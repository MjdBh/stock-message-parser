//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 01:46:59 PM IRDT 
//


package com.example.trade.tse.message.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IValiOmIns.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IValiOmIns">
 *   &lt;restriction base="{http://www.example.com/tse/TSETypes}BaseString">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="d"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IValiOmIns")
@XmlEnum
public enum IValiOmIns {

    E("E"),
    @XmlEnumValue("d")
    D("d");
    private final String value;

    IValiOmIns(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IValiOmIns fromValue(String v) {
        for (IValiOmIns c: IValiOmIns.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
