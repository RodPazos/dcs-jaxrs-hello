package br.pro.ramon.dcs.jaxrs.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/ola")
public class OlaResource {

    @GET
    public String getOlaMundo(@QueryParam("nome") String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            nome = "mundo";
        }

        return "Olá, " + nome + "!";
    }

}
