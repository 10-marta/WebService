package it.accenture.ws.service;

import it.accenture.ws.entity.Gara;

import java.util.ArrayList;
import java.util.List;

public class GaraService {

    private List<Gara> gare = new ArrayList<>();

    public GaraService(){
        gare.add(new Gara(1L,"Trofeo Coni","Cagliari"));
        gare.add(new Gara(2L,"Granfondo Baunei","Baunei"));
    }

    public Gara findById(Long id){
        for(int i = 0; i < gare.size(); i++){
            if(gare.get(i).getId().equals(id)){
                return gare.get(i);
            }
        }
        throw  new RuntimeException("La gara non è presente");
    }

    public List<Gara> findAll(){return gare;}
}
