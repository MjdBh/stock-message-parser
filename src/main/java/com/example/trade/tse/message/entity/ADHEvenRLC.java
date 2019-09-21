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
 * <p>Java class for ADHEvenRLC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADHEvenRLC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfEvent" type="{http://www.example.com/tse/TSETypes}DEvenRLC"/>
 *         &lt;element name="TimeOfEvent" type="{http://www.example.com/tse/TSETypes}HEvenRLC"/>
 *         &lt;element name="NumberOfMilliseconds" type="{http://www.example.com/tse/TSETypes}ZMlsHEvenRLC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADHEvenRLC", propOrder = {
    "dateOfEvent",
    "timeOfEvent",
    "numberOfMilliseconds"
})
public class ADHEvenRLC {

    @XmlElement(name = "DateOfEvent", required = true)
    protected BigInteger dateOfEvent;
    @XmlElement(name = "TimeOfEvent", required = true)
    protected BigInteger timeOfEvent;
    @XmlElement(name = "NumberOfMilliseconds", required = true)
    protected String numberOfMilliseconds;

    /**
     * Gets the value of the dateOfEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDateOfEvent() {
        return dateOfEvent;
    }

    /**
     * Sets the value of the dateOfEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDateOfEvent(BigInteger value) {
        this.dateOfEvent = value;
    }

    /**
     * Gets the value of the timeOfEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Sets the value of the timeOfEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOfEvent(BigInteger value) {
        this.timeOfEvent = value;
    }

    /**
     * Gets the value of the numberOfMilliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfMilliseconds() {
        return numberOfMilliseconds;
    }

    /**
     * Sets the value of the numberOfMilliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfMilliseconds(String value) {
        this.numberOfMilliseconds = value;
    }

}