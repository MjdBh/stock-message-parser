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
 * <p>Java class for StSplitAgg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StSplitAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentNumberOfShares" type="{http://www.example.com/tse/TSETypes}QCurStSplit"/>
 *         &lt;element name="NewNumberOfShares" type="{http://www.example.com/tse/TSETypes}QNewStSplit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StSplitAgg", propOrder = {
    "currentNumberOfShares",
    "newNumberOfShares"
})
public class StSplitAgg {

    @XmlElement(name = "CurrentNumberOfShares", required = true)
    protected BigInteger currentNumberOfShares;
    @XmlElement(name = "NewNumberOfShares", required = true)
    protected BigInteger newNumberOfShares;

    /**
     * Gets the value of the currentNumberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentNumberOfShares() {
        return currentNumberOfShares;
    }

    /**
     * Sets the value of the currentNumberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentNumberOfShares(BigInteger value) {
        this.currentNumberOfShares = value;
    }

    /**
     * Gets the value of the newNumberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewNumberOfShares() {
        return newNumberOfShares;
    }

    /**
     * Sets the value of the newNumberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewNumberOfShares(BigInteger value) {
        this.newNumberOfShares = value;
    }

}