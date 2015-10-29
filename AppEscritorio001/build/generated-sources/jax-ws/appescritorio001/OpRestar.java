
package appescritorio001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OpRestar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OpRestar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numero2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpRestar", propOrder = {
    "numero1",
    "numero2"
})
public class OpRestar {

    protected double numero1;
    protected double numero2;

    /**
     * Obtiene el valor de la propiedad numero1.
     * 
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * Define el valor de la propiedad numero1.
     * 
     */
    public void setNumero1(double value) {
        this.numero1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero2.
     * 
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * Define el valor de la propiedad numero2.
     * 
     */
    public void setNumero2(double value) {
        this.numero2 = value;
    }

}
