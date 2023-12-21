package it.accenture.ws.entity;

public class Atleta {

    Long id;
    String nome;
    String cognome;
    String categoria;

    public Atleta(Long id, String nome, String cognome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", Nome='" + nome + '\'' +
                ", Cognome='" + cognome + '\'' +
                ", Categoria='" + categoria + '\'' +
                '}';
    }
}
