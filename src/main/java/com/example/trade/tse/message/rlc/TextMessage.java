//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 01:46:59 PM IRDT 
//


package com.example.trade.tse.message.rlc;

import com.example.trade.tse.message.entity.IUrg;
import com.example.trade.tse.message.entity.YCrl;
import com.example.trade.tse.message.entity.YDest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrumentGroupIdentification" type="{http://www.example.com/tse/TSETypes}CIdGrc"/>
 *         &lt;element name="PriorityIndicator" type="{http://www.example.com/tse/TSETypes}IUrg"/>
 *         &lt;element name="NatureOfMessage" type="{http://www.example.com/tse/TSETypes}YCrl"/>
 *         &lt;element name="AddressType" type="{http://www.example.com/tse/TSETypes}YDest"/>
 *         &lt;element name="MessageNumber" type="{http://www.example.com/tse/TSETypes}CIdMsg"/>
 *         &lt;element name="NumberOfMessagesInThisMessage" type="{http://www.example.com/tse/TSETypes}ZTotSeg"/>
 *         &lt;element name="SequenceNumberOfMessageWithinThisMessage" type="{http://www.example.com/tse/TSETypes}NSeqSeg"/>
 *         &lt;element name="MessageTitle" type="{http://www.example.com/tse/TSETypes}LTit"/>
 *         &lt;element name="MessageText" type="{http://www.example.com/tse/TSETypes}LMsg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typeOfMarket",
    "priorityIndicator",
    "natureOfMessage",
    "addressType",
    "messageNumber",
    "numberOfMessagesInThisMessage",
    "sequenceNumberOfMessageWithinThisMessage",
    "messageTitle",
    "messageText"
})
@XmlRootElement(name = "TextMessage", namespace = "http://www.example.com/tse/message/rlc/23")
public class TextMessage {

    @XmlElement(name = "TypeOfMarket", required = true)
    protected String typeOfMarket;
    @XmlElement(name = "PriorityIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected IUrg priorityIndicator;
    @XmlElement(name = "NatureOfMessage", required = true)
    @XmlSchemaType(name = "string")
    protected YCrl natureOfMessage;
    @XmlElement(name = "AddressType", required = true)
    @XmlSchemaType(name = "string")
    protected YDest addressType;
    @XmlElement(name = "MessageNumber", required = true)
    protected String messageNumber;
    @XmlElement(name = "NumberOfMessagesInThisMessage", required = true)
    protected String numberOfMessagesInThisMessage;
    @XmlElement(name = "SequenceNumberOfMessageWithinThisMessage", required = true)
    protected String sequenceNumberOfMessageWithinThisMessage;
    @XmlElement(name = "MessageTitle", required = true)
    protected String messageTitle;
    @XmlElement(name = "MessageText", required = true)
    protected String messageText;

    /**
     * Gets the value of the TypeOfMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfMarket() {
        return typeOfMarket;
    }

    /**
     * Sets the value of the typeOfMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfMarket(String value) {
        this.typeOfMarket = value;
    }

    /**
     * Gets the value of the priorityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IUrg }
     *     
     */
    public IUrg getPriorityIndicator() {
        return priorityIndicator;
    }

    /**
     * Sets the value of the priorityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IUrg }
     *     
     */
    public void setPriorityIndicator(IUrg value) {
        this.priorityIndicator = value;
    }

    /**
     * Gets the value of the natureOfMessage property.
     * 
     * @return
     *     possible object is
     *     {@link YCrl }
     *     
     */
    public YCrl getNatureOfMessage() {
        return natureOfMessage;
    }

    /**
     * Sets the value of the natureOfMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link YCrl }
     *     
     */
    public void setNatureOfMessage(YCrl value) {
        this.natureOfMessage = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link YDest }
     *     
     */
    public YDest getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YDest }
     *     
     */
    public void setAddressType(YDest value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the messageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageNumber(String value) {
        this.messageNumber = value;
    }

    /**
     * Gets the value of the numberOfMessagesInThisMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfMessagesInThisMessage() {
        return numberOfMessagesInThisMessage;
    }

    /**
     * Sets the value of the numberOfMessagesInThisMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfMessagesInThisMessage(String value) {
        this.numberOfMessagesInThisMessage = value;
    }

    /**
     * Gets the value of the sequenceNumberOfMessageWithinThisMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumberOfMessageWithinThisMessage() {
        return sequenceNumberOfMessageWithinThisMessage;
    }

    /**
     * Sets the value of the sequenceNumberOfMessageWithinThisMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumberOfMessageWithinThisMessage(String value) {
        this.sequenceNumberOfMessageWithinThisMessage = value;
    }

    /**
     * Gets the value of the messageTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * Sets the value of the messageTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTitle(String value) {
        this.messageTitle = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}
