//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 01:46:59 PM IRDT 
//


package com.example.trade.tse.message.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YPLimSaiOM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YPLimSaiOM">
 *   &lt;restriction base="{http://www.example.com/tse/TSETypes}BaseString">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YPLimSaiOM")
@XmlEnum
public enum YPLimSaiOM {

    L,
    O,
    K,
    S,
    M;

    public String value() {
        return name();
    }

    public static YPLimSaiOM fromValue(String v) {
        return valueOf(v);
    }

}
