
package it.accenture.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "recuperoAtleta", namespace = "http://ws.accenture.it/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoAtleta", namespace = "http://ws.accenture.it/")
public class RecuperoAtleta {

    @XmlElement(name = "id", namespace = "")
    private Long id;

    /**
     * 
     * @return
     *     returns Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(Long id) {
        this.id = id;
    }

}