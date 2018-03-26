
package org.me.mortgagecalc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.mortgagecalc package. 
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

    private final static QName _CalcMortgage_QNAME = new QName("http://mortgagecalc.me.org/", "calcMortgage");
    private final static QName _CalcMortgageResponse_QNAME = new QName("http://mortgagecalc.me.org/", "calcMortgageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.mortgagecalc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcMortgage }
     * 
     */
    public CalcMortgage createCalcMortgage() {
        return new CalcMortgage();
    }

    /**
     * Create an instance of {@link CalcMortgageResponse }
     * 
     */
    public CalcMortgageResponse createCalcMortgageResponse() {
        return new CalcMortgageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcMortgage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mortgagecalc.me.org/", name = "calcMortgage")
    public JAXBElement<CalcMortgage> createCalcMortgage(CalcMortgage value) {
        return new JAXBElement<CalcMortgage>(_CalcMortgage_QNAME, CalcMortgage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcMortgageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mortgagecalc.me.org/", name = "calcMortgageResponse")
    public JAXBElement<CalcMortgageResponse> createCalcMortgageResponse(CalcMortgageResponse value) {
        return new JAXBElement<CalcMortgageResponse>(_CalcMortgageResponse_QNAME, CalcMortgageResponse.class, null, value);
    }

}
