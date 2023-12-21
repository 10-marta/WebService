package it.accenture.ws.service;

import it.accenture.ws.entity.Atleta;

import java.util.ArrayList;
import java.util.List;

public class AtletaService {


    private List<Atleta> atleti= new ArrayList<>();

    public AtletaService(){
        atleti.add(new Atleta(1L,"Ciccio","Puzzo","M4"));
        atleti.add(new Atleta(2L,"Gino","Pasticcio","M1"));
    }
    public Atleta findById(Long id){
        for (int i = 0; i < atleti.size(); i++){
            if(atleti.get(i).getId().equals(id)){
                return atleti.get(i);
            }
        }
        throw new RuntimeException("L'atleta non è presente");
    }

    public List<Atleta> findAll(){return atleti;}
}
