package com.aula;

import jakarta.ws.rs.*;

@Path("/conversorNos")
public class ConversorNos {
    @GET
    @Path("/{valor}")
    @Produces("application/json")
    public String converter(@PathParam("valor") Double valor)
    {
        //return com duas casas decimais
        return String.format("Valor em Nos: %.2f, Valor convertido em Km/h: %.2f", valor, valor * 1.852);
    }
}