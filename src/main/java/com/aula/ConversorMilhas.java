package com.aula;

import jakarta.ws.rs.*;

@Path("/conversorMilhas")
public class ConversorMilhas {
    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    public String converterMilhas(String km) {
        double kmDouble = Double.parseDouble(km);
        double milhas = kmDouble * 0.621371;
        return String.valueOf(milhas);
    }
}