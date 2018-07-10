package com.example.rest_shiro;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.secnod.shiro.jaxrs.Auth;

@Path("/auth")
@Produces(MediaType.TEXT_PLAIN)
public class AuthResource {
	@GET
	@Path("/access")
	@RequiresPermissions("ROLE_USER_GET")
    public String getxxx() {
        return "OK";
    }
	
    @GET
    public String get(@Auth User user) {
    	user.checkPermissionBySomeRule();
        return "OK";
    }

    @PUT
    @RequiresPermissions("ROLE_ADMIN")
    public String set() {
        return "xxx";
    }
}