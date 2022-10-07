package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/devs13")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Bom dia, desenvolvedores. Acreditem o uso do quarkus é muito tranquilo até para quem ainda não entende JAVA.";
    }
}
