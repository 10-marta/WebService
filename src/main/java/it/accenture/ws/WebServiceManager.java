package it.accenture.ws;

import it.accenture.ws.entity.Atleta;
import it.accenture.ws.entity.Gara;
import it.accenture.ws.service.AtletaService;
import it.accenture.ws.service.GaraService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(
        serviceName = "WebService"
)
public class WebServiceManager {


    private AtletaService atletaService = new AtletaService();
    private GaraService garaService = new GaraService();

    /*
    public WebServiceManager(AtletaService atletaService, GaraService garaService) {
        this.atletaService = new AtletaService();
        this.garaService = new GaraService();
    }
     */

    @WebMethod
    public String saluti(){
        return "Hello!";
    }

    //metodi che servono a recuperare atletip e gare

    @WebMethod
    public Atleta recuperoAtleta(@WebParam(name = "id") Long id){
        return atletaService.findById(id);
    }

    @WebMethod
    public List<Atleta> recuperoAllAtleti(){
        return atletaService.findAll();
    }

    @WebMethod
    public Gara recuperoGara(@WebParam(name = "id")Long id) {
        return garaService.findById(id);
    }

    @WebMethod
    public List<Gara> recuperoAllGare(){
        return garaService.findAll();
    }

}
