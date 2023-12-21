
package it.accenture.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.accenture.ws.entity.Gara;

@XmlRootElement(name = "recuperoAllGareResponse", namespace = "http://ws.accenture.it/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoAllGareResponse", namespace = "http://ws.accenture.it/")
public class RecuperoAllGareResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Gara> _return;

    /**
     * 
     * @return
     *     returns List<Gara>
     */
    public List<Gara> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Gara> _return) {
        this._return = _return;
    }

}
