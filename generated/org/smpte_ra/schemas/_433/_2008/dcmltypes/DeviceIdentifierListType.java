//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 02:11:38 AM PDT 
//


package org.smpte_ra.schemas._433._2008.dcmltypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceIdentifierListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceIdentifierListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryID" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}deviceIdentifierPolyType"/>
 *         &lt;element name="SecondaryID" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}deviceIdentifierPolyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceIdentifierListType", propOrder = {
    "primaryID",
    "secondaryID"
})
public class DeviceIdentifierListType {

    @XmlElement(name = "PrimaryID", required = true)
    protected DeviceIdentifierPolyType primaryID;
    @XmlElement(name = "SecondaryID")
    protected DeviceIdentifierPolyType secondaryID;

    /**
     * Gets the value of the primaryID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdentifierPolyType }
     *     
     */
    public DeviceIdentifierPolyType getPrimaryID() {
        return primaryID;
    }

    /**
     * Sets the value of the primaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdentifierPolyType }
     *     
     */
    public void setPrimaryID(DeviceIdentifierPolyType value) {
        this.primaryID = value;
    }

    /**
     * Gets the value of the secondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdentifierPolyType }
     *     
     */
    public DeviceIdentifierPolyType getSecondaryID() {
        return secondaryID;
    }

    /**
     * Sets the value of the secondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdentifierPolyType }
     *     
     */
    public void setSecondaryID(DeviceIdentifierPolyType value) {
        this.secondaryID = value;
    }

}
