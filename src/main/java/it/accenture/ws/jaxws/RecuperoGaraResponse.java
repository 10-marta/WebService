
package it.accenture.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.accenture.ws.entity.Gara;

@XmlRootElement(name = "recuperoGaraResponse", namespace = "http://ws.accenture.it/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoGaraResponse", namespace = "http://ws.accenture.it/")
public class RecuperoGaraResponse {

    @XmlElement(name = "return", namespace = "")
    private Gara _return;

    /**
     * 
     * @return
     *     returns Gara
     */
    public Gara getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Gara _return) {
        this._return = _return;
    }

}
