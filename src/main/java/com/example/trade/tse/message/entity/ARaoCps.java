//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 01:46:59 PM IRDT 
//


package com.example.trade.tse.message.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARaoCps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARaoCps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentMultipleSign" type="{http://www.example.com/tse/TSETypes}CSignKMuProdCps"/>
 *         &lt;element name="LegNumberRatio" type="{http://www.example.com/tse/TSETypes}KRaoCpsStg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARaoCps", propOrder = {
    "componentMultipleSign",
    "legNumberRatio"
})
public class ARaoCps {

    @XmlElement(name = "ComponentMultipleSign", required = true)
    protected String componentMultipleSign;
    @XmlElement(name = "LegNumberRatio", required = true)
    protected BigInteger legNumberRatio;

    /**
     * Gets the value of the componentMultipleSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentMultipleSign() {
        return componentMultipleSign;
    }

    /**
     * Sets the value of the componentMultipleSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentMultipleSign(String value) {
        this.componentMultipleSign = value;
    }

    /**
     * Gets the value of the legNumberRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegNumberRatio() {
        return legNumberRatio;
    }

    /**
     * Sets the value of the legNumberRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegNumberRatio(BigInteger value) {
        this.legNumberRatio = value;
    }

}