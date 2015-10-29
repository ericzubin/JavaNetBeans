
package appescritorio001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the appescritorio001 package. 
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

    private final static QName _OpRestar_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpRestar");
    private final static QName _OpRestarResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpRestarResponse");
    private final static QName _OpDividirResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpDividirResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.proyecto.empresa.com/", "hello");
    private final static QName _OpSumar_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpSumar");
    private final static QName _OpMultiplicarResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpMultiplicarResponse");
    private final static QName _OpMultiplicar_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpMultiplicar");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "helloResponse");
    private final static QName _OpSumarResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpSumarResponse");
    private final static QName _OpDividir_QNAME = new QName("http://ws.proyecto.empresa.com/", "OpDividir");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: appescritorio001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpDividir }
     * 
     */
    public OpDividir createOpDividir() {
        return new OpDividir();
    }

    /**
     * Create an instance of {@link OpSumarResponse }
     * 
     */
    public OpSumarResponse createOpSumarResponse() {
        return new OpSumarResponse();
    }

    /**
     * Create an instance of {@link OpMultiplicar }
     * 
     */
    public OpMultiplicar createOpMultiplicar() {
        return new OpMultiplicar();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link OpSumar }
     * 
     */
    public OpSumar createOpSumar() {
        return new OpSumar();
    }

    /**
     * Create an instance of {@link OpMultiplicarResponse }
     * 
     */
    public OpMultiplicarResponse createOpMultiplicarResponse() {
        return new OpMultiplicarResponse();
    }

    /**
     * Create an instance of {@link OpDividirResponse }
     * 
     */
    public OpDividirResponse createOpDividirResponse() {
        return new OpDividirResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link OpRestarResponse }
     * 
     */
    public OpRestarResponse createOpRestarResponse() {
        return new OpRestarResponse();
    }

    /**
     * Create an instance of {@link OpRestar }
     * 
     */
    public OpRestar createOpRestar() {
        return new OpRestar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpRestar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpRestar")
    public JAXBElement<OpRestar> createOpRestar(OpRestar value) {
        return new JAXBElement<OpRestar>(_OpRestar_QNAME, OpRestar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpRestarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpRestarResponse")
    public JAXBElement<OpRestarResponse> createOpRestarResponse(OpRestarResponse value) {
        return new JAXBElement<OpRestarResponse>(_OpRestarResponse_QNAME, OpRestarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpDividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpDividirResponse")
    public JAXBElement<OpDividirResponse> createOpDividirResponse(OpDividirResponse value) {
        return new JAXBElement<OpDividirResponse>(_OpDividirResponse_QNAME, OpDividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpSumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpSumar")
    public JAXBElement<OpSumar> createOpSumar(OpSumar value) {
        return new JAXBElement<OpSumar>(_OpSumar_QNAME, OpSumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpMultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpMultiplicarResponse")
    public JAXBElement<OpMultiplicarResponse> createOpMultiplicarResponse(OpMultiplicarResponse value) {
        return new JAXBElement<OpMultiplicarResponse>(_OpMultiplicarResponse_QNAME, OpMultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpMultiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpMultiplicar")
    public JAXBElement<OpMultiplicar> createOpMultiplicar(OpMultiplicar value) {
        return new JAXBElement<OpMultiplicar>(_OpMultiplicar_QNAME, OpMultiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpSumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpSumarResponse")
    public JAXBElement<OpSumarResponse> createOpSumarResponse(OpSumarResponse value) {
        return new JAXBElement<OpSumarResponse>(_OpSumarResponse_QNAME, OpSumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpDividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "OpDividir")
    public JAXBElement<OpDividir> createOpDividir(OpDividir value) {
        return new JAXBElement<OpDividir>(_OpDividir_QNAME, OpDividir.class, null, value);
    }

}
