//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 02:06:08 AM PDT 
//


package org.smpte_ra.schemas._2067_101._2014.pixel_encoder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.schemas._2067_100._2014.MacroType;
import org.smpte_ra.schemas._433._2008.dcmltypes.UserTextType;


/**
 * <p>Java class for PixelEncoderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PixelEncoderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.smpte-ra.org/schemas/2067-100/2014}Macro">
 *       &lt;sequence>
 *         &lt;element name="InputReferenceImageSequence">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Annotation" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UserTextType" minOccurs="0"/>
 *                   &lt;element name="Handle" type="{http://www.smpte-ra.org/schemas/2067-100/2014}Handle"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OutputImageSequence">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Annotation" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UserTextType" minOccurs="0"/>
 *                   &lt;element name="ColorEncoding" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PixelEncoderType", propOrder = {
    "inputReferenceImageSequence",
    "outputImageSequence"
})
public class PixelEncoderType
    extends MacroType
{

    @XmlElement(name = "InputReferenceImageSequence", required = true)
    protected PixelEncoderType.InputReferenceImageSequence inputReferenceImageSequence;
    @XmlElement(name = "OutputImageSequence", required = true)
    protected PixelEncoderType.OutputImageSequence outputImageSequence;

    /**
     * Gets the value of the inputReferenceImageSequence property.
     * 
     * @return
     *     possible object is
     *     {@link PixelEncoderType.InputReferenceImageSequence }
     *     
     */
    public PixelEncoderType.InputReferenceImageSequence getInputReferenceImageSequence() {
        return inputReferenceImageSequence;
    }

    /**
     * Sets the value of the inputReferenceImageSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelEncoderType.InputReferenceImageSequence }
     *     
     */
    public void setInputReferenceImageSequence(PixelEncoderType.InputReferenceImageSequence value) {
        this.inputReferenceImageSequence = value;
    }

    /**
     * Gets the value of the outputImageSequence property.
     * 
     * @return
     *     possible object is
     *     {@link PixelEncoderType.OutputImageSequence }
     *     
     */
    public PixelEncoderType.OutputImageSequence getOutputImageSequence() {
        return outputImageSequence;
    }

    /**
     * Sets the value of the outputImageSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelEncoderType.OutputImageSequence }
     *     
     */
    public void setOutputImageSequence(PixelEncoderType.OutputImageSequence value) {
        this.outputImageSequence = value;
    }


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
     *         &lt;element name="Annotation" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UserTextType" minOccurs="0"/>
     *         &lt;element name="Handle" type="{http://www.smpte-ra.org/schemas/2067-100/2014}Handle"/>
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
        "annotation",
        "handle"
    })
    public static class InputReferenceImageSequence {

        @XmlElement(name = "Annotation")
        protected UserTextType annotation;
        @XmlElement(name = "Handle", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String handle;

        /**
         * Gets the value of the annotation property.
         * 
         * @return
         *     possible object is
         *     {@link UserTextType }
         *     
         */
        public UserTextType getAnnotation() {
            return annotation;
        }

        /**
         * Sets the value of the annotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserTextType }
         *     
         */
        public void setAnnotation(UserTextType value) {
            this.annotation = value;
        }

        /**
         * Gets the value of the handle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHandle() {
            return handle;
        }

        /**
         * Sets the value of the handle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHandle(String value) {
            this.handle = value;
        }

    }


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
     *         &lt;element name="Annotation" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UserTextType" minOccurs="0"/>
     *         &lt;element name="ColorEncoding" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
        "annotation",
        "colorEncoding"
    })
    public static class OutputImageSequence {

        @XmlElement(name = "Annotation")
        protected UserTextType annotation;
        @XmlElement(name = "ColorEncoding", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String colorEncoding;

        /**
         * Gets the value of the annotation property.
         * 
         * @return
         *     possible object is
         *     {@link UserTextType }
         *     
         */
        public UserTextType getAnnotation() {
            return annotation;
        }

        /**
         * Sets the value of the annotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserTextType }
         *     
         */
        public void setAnnotation(UserTextType value) {
            this.annotation = value;
        }

        /**
         * Gets the value of the colorEncoding property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColorEncoding() {
            return colorEncoding;
        }

        /**
         * Sets the value of the colorEncoding property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColorEncoding(String value) {
            this.colorEncoding = value;
        }

    }

}
