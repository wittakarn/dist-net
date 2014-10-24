/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittakarn.rest.webservicel;

import com.wittakarn.business.Login;
import com.wittakarn.domain.User;
import java.io.Serializable;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Wittakarn
 */
@Path("/LoginRestful")
public class LoginRestfulWebservice implements Serializable{

    @GET
    @Path("/authorize/{user}/{pass}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response authorize(@PathParam("user") String user, @PathParam("pass") String pass) {
        boolean success;
        try {
            success = Login.authorize(new User(user, pass));
            return Response.status(Response.Status.OK).entity(success).build();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }

    }
}
