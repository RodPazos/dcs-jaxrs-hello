package br.pro.ramon.dcs.jaxrs.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ola")
public class OlaResource {

    @GET
    public String getOlaMundo() {
        return "Olá, mundo!";
    }

}
