//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 01:46:59 PM IRDT 
//


package com.example.trade.tse.message.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AClsEcoFtseSoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AClsEcoFtseSoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FTSEIdEconomicGroup" type="{http://www.example.com/tse/TSETypes}CGdSecEcoFtse"/>
 *         &lt;element name="FTSESectorId" type="{http://www.example.com/tse/TSETypes}CSecEcoFtse"/>
 *         &lt;element name="FirstFiveLiquidityProviderID" type="{http://www.example.com/tse/TSETypes}CSoSecEcoFtse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AClsEcoFtseSoc", propOrder = {
    "ftseIdEconomicGroup",
    "ftseSectorId",
    "firstFiveLiquidityProviderID"
})
public class AClsEcoFtseSoc {

    @XmlElement(name = "FTSEIdEconomicGroup", required = true)
    protected String ftseIdEconomicGroup;
    @XmlElement(name = "FTSESectorId", required = true)
    protected String ftseSectorId;
    @XmlElement(name = "FirstFiveLiquidityProviderID", required = true)
    protected String firstFiveLiquidityProviderID;

    /**
     * Gets the value of the ftseIdEconomicGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTSEIdEconomicGroup() {
        return ftseIdEconomicGroup;
    }

    /**
     * Sets the value of the ftseIdEconomicGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTSEIdEconomicGroup(String value) {
        this.ftseIdEconomicGroup = value;
    }

    /**
     * Gets the value of the ftseSectorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTSESectorId() {
        return ftseSectorId;
    }

    /**
     * Sets the value of the ftseSectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTSESectorId(String value) {
        this.ftseSectorId = value;
    }

    /**
     * Gets the value of the firstFiveLiquidityProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstFiveLiquidityProviderID() {
        return firstFiveLiquidityProviderID;
    }

    /**
     * Sets the value of the firstFiveLiquidityProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstFiveLiquidityProviderID(String value) {
        this.firstFiveLiquidityProviderID = value;
    }

}
