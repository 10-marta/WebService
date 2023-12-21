
package it.accenture.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.accenture.ws.entity.Atleta;

@XmlRootElement(name = "recuperoAtletaResponse", namespace = "http://ws.accenture.it/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoAtletaResponse", namespace = "http://ws.accenture.it/")
public class RecuperoAtletaResponse {

    @XmlElement(name = "return", namespace = "")
    private Atleta _return;

    /**
     * 
     * @return
     *     returns Atleta
     */
    public Atleta getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Atleta _return) {
        this._return = _return;
    }

}
