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
 * <p>Java class for AKProdCpsProdYCbn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AKProdCpsProdYCbn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentProductMultiplicationCoefficientSign" type="{http://www.example.com/tse/TSETypes}CSignKMuProdCps"/>
 *         &lt;element name="CombinedProductComponentMultiplicationCoefficient" type="{http://www.example.com/tse/TSETypes}KMuProdCpsProdCbn"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AKProdCpsProdYCbn", propOrder = {
    "componentProductMultiplicationCoefficientSign",
    "combinedProductComponentMultiplicationCoefficient"
})
public class AKProdCpsProdYCbn {

    @XmlElement(name = "ComponentProductMultiplicationCoefficientSign", required = true)
    protected String componentProductMultiplicationCoefficientSign;
    @XmlElement(name = "CombinedProductComponentMultiplicationCoefficient", required = true)
    protected BigInteger combinedProductComponentMultiplicationCoefficient;

    /**
     * Gets the value of the componentProductMultiplicationCoefficientSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentProductMultiplicationCoefficientSign() {
        return componentProductMultiplicationCoefficientSign;
    }

    /**
     * Sets the value of the componentProductMultiplicationCoefficientSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentProductMultiplicationCoefficientSign(String value) {
        this.componentProductMultiplicationCoefficientSign = value;
    }

    /**
     * Gets the value of the combinedProductComponentMultiplicationCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCombinedProductComponentMultiplicationCoefficient() {
        return combinedProductComponentMultiplicationCoefficient;
    }

    /**
     * Sets the value of the combinedProductComponentMultiplicationCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCombinedProductComponentMultiplicationCoefficient(BigInteger value) {
        this.combinedProductComponentMultiplicationCoefficient = value;
    }

}
