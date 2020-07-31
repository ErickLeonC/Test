package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello1")
public class HolaMundo {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello1() {
        return "Hola Mundo";
    }
}
