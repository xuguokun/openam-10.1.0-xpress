//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.soapbinding.jaxb;


/**
 * Java content class for ConsentType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-soap-binding.xsd line 110)
 * <p>
 * <pre>
 * &lt;complexType name="ConsentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}actor"/>
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}mustUnderstand"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ConsentType {


    /**
     * Gets the value of the mustUnderstand property.
     * 
     */
    boolean isMustUnderstand();

    /**
     * Sets the value of the mustUnderstand property.
     * 
     */
    void setMustUnderstand(boolean value);

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getActor();

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setActor(java.lang.String value);

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getUri();

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setUri(java.lang.String value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getTimestamp();

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setTimestamp(java.util.Calendar value);

}
