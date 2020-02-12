//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.12 at 03:28:31 PM MSK 
//


package com.mycompany.soapstub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.soapstub package. 
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

    private final static QName _ProcessCash_QNAME = new QName("http://soapstub.mycompany.com/", "processCash");
    private final static QName _ProcessCashResponse_QNAME = new QName("http://soapstub.mycompany.com/", "processCashResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.soapstub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessCash }
     * 
     */
    public ProcessCash createProcessCash() {
        return new ProcessCash();
    }

    /**
     * Create an instance of {@link ProcessCashResponse }
     * 
     */
    public ProcessCashResponse createProcessCashResponse() {
        return new ProcessCashResponse();
    }

    /**
     * Create an instance of {@link CashOperationRq }
     * 
     */
    public CashOperationRq createCashOperationRq() {
        return new CashOperationRq();
    }

    /**
     * Create an instance of {@link CashOperationRs }
     * 
     */
    public CashOperationRs createCashOperationRs() {
        return new CashOperationRs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCash }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessCash }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapstub.mycompany.com/", name = "processCash")
    public JAXBElement<ProcessCash> createProcessCash(ProcessCash value) {
        return new JAXBElement<ProcessCash>(_ProcessCash_QNAME, ProcessCash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCashResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessCashResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapstub.mycompany.com/", name = "processCashResponse")
    public JAXBElement<ProcessCashResponse> createProcessCashResponse(ProcessCashResponse value) {
        return new JAXBElement<ProcessCashResponse>(_ProcessCashResponse_QNAME, ProcessCashResponse.class, null, value);
    }

}
