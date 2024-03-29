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
 * <p>Java class for ASecEco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASecEco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EconomicGroupingCodeOfIssuer" type="{http://www.example.com/tse/TSETypes}CGdSecEco"/>
 *         &lt;element name="CodeForIndustryIssuingCompany" type="{http://www.example.com/tse/TSETypes}CSecAtvEco"/>
 *         &lt;element name="CodeForBusinessSegmentIssuingCompany" type="{http://www.example.com/tse/TSETypes}CSecCompAtv"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASecEco", propOrder = {
    "economicGroupingCodeOfIssuer",
    "codeForIndustryIssuingCompany",
    "codeForBusinessSegmentIssuingCompany"
})
public class ASecEco {

    @XmlElement(name = "EconomicGroupingCodeOfIssuer", required = true)
    protected BigInteger economicGroupingCodeOfIssuer;
    @XmlElement(name = "CodeForIndustryIssuingCompany", required = true)
    protected BigInteger codeForIndustryIssuingCompany;
    @XmlElement(name = "CodeForBusinessSegmentIssuingCompany", required = true)
    protected BigInteger codeForBusinessSegmentIssuingCompany;

    /**
     * Gets the value of the economicGroupingCodeOfIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEconomicGroupingCodeOfIssuer() {
        return economicGroupingCodeOfIssuer;
    }

    /**
     * Sets the value of the economicGroupingCodeOfIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEconomicGroupingCodeOfIssuer(BigInteger value) {
        this.economicGroupingCodeOfIssuer = value;
    }

    /**
     * Gets the value of the codeForIndustryIssuingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodeForIndustryIssuingCompany() {
        return codeForIndustryIssuingCompany;
    }

    /**
     * Sets the value of the codeForIndustryIssuingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodeForIndustryIssuingCompany(BigInteger value) {
        this.codeForIndustryIssuingCompany = value;
    }

    /**
     * Gets the value of the codeForBusinessSegmentIssuingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodeForBusinessSegmentIssuingCompany() {
        return codeForBusinessSegmentIssuingCompany;
    }

    /**
     * Sets the value of the codeForBusinessSegmentIssuingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodeForBusinessSegmentIssuingCompany(BigInteger value) {
        this.codeForBusinessSegmentIssuingCompany = value;
    }

}
