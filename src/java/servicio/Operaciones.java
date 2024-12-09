/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author nico0
 */
@Path("generic")
public class Operaciones {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Operaciones
     */
    public Operaciones() {
    }

    @GET
    @Path("/Lista")
    public List<String> Listar(){
        List<String> items = new ArrayList<>();
        items.add("450170");
        items.add("150891");
        items.add("131415");
        items.add("253570");
        items.add("701001");
        
        return items;
    }
    
    @GET
    @Path("buscar/{id}")
    public int buscar(@PathParam("id") String id){
        int rta = 0;
        for (int i = 0; i < Listar().size(); i++){
            if (Listar().get(i).equals(id)){
                return 1;
            }
        }
        return rta;
    }
}
