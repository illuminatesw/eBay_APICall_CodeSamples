//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdFormatLeadStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdFormatLeadStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Responded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdFormatLeadStatusCodeType")
@XmlEnum
public enum AdFormatLeadStatusCodeType {


    /**
     * 
     * 						A new message from a prospective buyer that the seller has not yet responded to.
     * 					
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * 
     * 						A message from a prospective buyer that the seller has responded to.
     * 					
     * 
     */
    @XmlEnumValue("Responded")
    RESPONDED("Responded"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AdFormatLeadStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdFormatLeadStatusCodeType fromValue(String v) {
        for (AdFormatLeadStatusCodeType c: AdFormatLeadStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}