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
 * <p>Java class for ASbAniVal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASbAniVal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstFiveLiquidityProviderID" type="{http://www.example.com/tse/TSETypes}CResSbAniVal"/>
 *         &lt;element name="LastThreeLiquidityProviderID" type="{http://www.example.com/tse/TSETypes}CSbAniVal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASbAniVal", propOrder = {
    "firstFiveLiquidityProviderID",
    "lastThreeLiquidityProviderID"
})
public class ASbAniVal {

    @XmlElement(name = "FirstFiveLiquidityProviderID", required = true)
    protected BigInteger firstFiveLiquidityProviderID;
    @XmlElement(name = "LastThreeLiquidityProviderID", required = true)
    protected BigInteger lastThreeLiquidityProviderID;

    /**
     * Gets the value of the firstFiveLiquidityProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstFiveLiquidityProviderID() {
        return firstFiveLiquidityProviderID;
    }

    /**
     * Sets the value of the firstFiveLiquidityProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstFiveLiquidityProviderID(BigInteger value) {
        this.firstFiveLiquidityProviderID = value;
    }

    /**
     * Gets the value of the lastThreeLiquidityProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastThreeLiquidityProviderID() {
        return lastThreeLiquidityProviderID;
    }

    /**
     * Sets the value of the lastThreeLiquidityProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastThreeLiquidityProviderID(BigInteger value) {
        this.lastThreeLiquidityProviderID = value;
    }

}
