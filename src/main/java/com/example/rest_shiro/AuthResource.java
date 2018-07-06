package com.example.rest_shiro;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.shiro.authz.annotation.RequiresPermissions;

@Path("/auth")
@Produces(MediaType.TEXT_PLAIN)
@RequiresPermissions("protected:read")
public class AuthResource {

    @GET
    public String get() {
        return "OK";
    }

    @PUT
    @RequiresPermissions("protected:write")
    public String set(String value) {
        return value;
    }
}