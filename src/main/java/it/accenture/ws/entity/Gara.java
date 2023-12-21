package it.accenture.ws.entity;

public class Gara {

    Long id;
    String denominazione;
    String luogo;

    public Gara(Long id, String denominazione, String luogo) {
        this.id = id;
        this.denominazione = denominazione;
        this.luogo = luogo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", Denominaizione='" + denominazione + '\'' +
                ", Luogo='" + luogo + '\'' +
                '}';
    }
}
