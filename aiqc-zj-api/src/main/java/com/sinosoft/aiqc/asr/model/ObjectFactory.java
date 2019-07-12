
package com.sinosoft.aiqc.asr.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Speech_QNAME = new QName("", "Speech");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpeechType }
     *
     */
    public SpeechType createSpeechType() {
        return new SpeechType();
    }

    /**
     * Create an instance of {@link SubjectType }
     *
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link EndPointType }
     *
     */
    public EndPointType createEndPointType() {
        return new EndPointType();
    }

    /**
     * Create an instance of {@link RoleType }
     *
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link ItemType }
     *
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpeechType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Speech")
    public JAXBElement<SpeechType> createSpeech(SpeechType value) {
        return new JAXBElement<SpeechType>(_Speech_QNAME, SpeechType.class, null, value);
    }

}
