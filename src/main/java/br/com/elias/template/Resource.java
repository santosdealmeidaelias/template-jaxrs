package br.com.elias.template;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by elias on 07/09/16.
 */
@Path("home")
public class Resource {

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World!";
    }

    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String postMethod(@FormParam("name") String name) {
        return "<h2>,Hello, " + name + "</h2>";
    }
}