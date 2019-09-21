//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 01:46:59 PM IRDT 
//


package com.example.trade.tse.message.rlc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TechnicalHeader" type="{http://www.example.com/tse/TSETypes}BaseString"/>
 *         &lt;element name="MessageType" type="{http://www.example.com/tse/TSETypes}YMsgRLC"/>
 *         &lt;element name="FunctionalHeader" type="{http://www.example.com/tse/TSETypes}BaseString"/>
 *         &lt;element ref="{http://www.example.com/tse/message/rlc/23}TextMessage"/>
 *         &lt;element ref="{http://www.example.com/tse/message/rlc/32}OpeningSummary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "version",
        "type",
        "unId",
        "instrumentId",
        "shortId",
        "dateOfMessage",
        "timeOfMessage",
        "milliSecondsOfMessage",
        "messageType",
        "functionalHeader",
        "textMessage",
        "openingSummaryMessage",
})
@XmlRootElement(name = "RLCMessage", namespace = "http://www.example.com/tse/rlcMessage")
public class RLCMessage {

    @XmlElement(name = "Version")
    protected String version;

    @XmlElement(name = "Type")
    protected String type;

    @XmlElement(name = "UnId")
    protected String unId;

    @XmlElement(name = "InstrumentId")
    protected String instrumentId;

    @XmlElement(name = "ShortId")
    protected String shortId;

    @XmlElement(name = "DateOfMessage")
    protected String dateOfMessage;

    @XmlElement(name = "TimeOfMessage")
    protected String timeOfMessage;

    @XmlElement(name = "MilliSecondsOfMessage")
    protected String milliSecondsOfMessage;

    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElement(name = "FunctionalHeader")
    protected String functionalHeader;

    @XmlElement(name = "TextMessage", namespace = "http://www.example.com/tse/message/rlc/23")
    protected TextMessage textMessage;
    @XmlElement(name = "OpeningSummaryMessage", namespace = "http://www.exapmle.com/tse/message/rlc/32")
    protected OpeningSummaryMessage openingSummaryMessage;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnId() {
        return unId;
    }

    public void setUnId(String unId) {
        this.unId = unId;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public String getDateOfMessage() {
        return dateOfMessage;
    }

    public void setDateOfMessage(String dateOfMessage) {
        this.dateOfMessage = dateOfMessage;
    }

    public String getTimeOfMessage() {
        return timeOfMessage;
    }

    public void setTimeOfMessage(String timeOfMessage) {
        this.timeOfMessage = timeOfMessage;
    }

    public String getMilliSecondsOfMessage() {
        return milliSecondsOfMessage;
    }

    public void setMilliSecondsOfMessage(String milliSecondsOfMessage) {
        this.milliSecondsOfMessage = milliSecondsOfMessage;
    }

    /**
     * Gets the value of the messageType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the functionalHeader property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFunctionalHeader() {
        return functionalHeader;
    }

    /**
     * Sets the value of the functionalHeader property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFunctionalHeader(String value) {
        this.functionalHeader = value;
    }

    /**
     * Gets the value of the textMessage property.
     *
     * @return possible object is
     * {@link TextMessage }
     */
    public TextMessage getTextMessage() {
        return textMessage;
    }

    /**
     * Sets the value of the textMessage property.
     *
     * @param value allowed object is
     *              {@link TextMessage }
     */
    public void setTextMessage(TextMessage value) {
        this.textMessage = value;
    }

    /**
     * Gets the value of the openingSummary property.
     *
     * @return possible object is
     * {@link OpeningSummaryMessage }
     */
    public OpeningSummaryMessage getOpeningSummaryMessage() {
        return openingSummaryMessage;
    }

    /**
     * Sets the value of the openingSummary property.
     *
     * @param value allowed object is
     *              {@link OpeningSummaryMessage }
     */
    public void setOpeningSummaryMessage(OpeningSummaryMessage value) {
        this.openingSummaryMessage = value;
    }


}
