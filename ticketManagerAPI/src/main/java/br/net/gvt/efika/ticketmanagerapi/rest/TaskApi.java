package br.net.gvt.efika.ticketmanagerapi.rest;

import br.net.gvt.efika.customer.model.dto.GenericRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/ticket")
public class TaskApi {


    @POST
    @Path("/findByParameter")
    @Produces({"application/json", "application/xml"})
    public Response findByParameter(GenericRequest body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return null;
    }
}
