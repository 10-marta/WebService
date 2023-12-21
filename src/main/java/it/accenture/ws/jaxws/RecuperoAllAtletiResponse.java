
package it.accenture.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.accenture.ws.entity.Atleta;

@XmlRootElement(name = "recuperoAllAtletiResponse", namespace = "http://ws.accenture.it/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoAllAtletiResponse", namespace = "http://ws.accenture.it/")
public class RecuperoAllAtletiResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Atleta> _return;

    /**
     * 
     * @return
     *     returns List<Atleta>
     */
    public List<Atleta> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Atleta> _return) {
        this._return = _return;
    }

}
