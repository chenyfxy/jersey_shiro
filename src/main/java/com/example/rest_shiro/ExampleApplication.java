package com.example.rest_shiro;

import org.glassfish.jersey.server.ResourceConfig;
import org.secnod.shiro.jaxrs.ShiroExceptionMapper;
import org.secnod.shiro.jersey.AuthInjectionBinder;
import org.secnod.shiro.jersey.AuthorizationFilterFeature;
import org.secnod.shiro.jersey.SubjectFactory;

public class ExampleApplication extends ResourceConfig {
	public ExampleApplication() {
        super();
        register(new AuthorizationFilterFeature());
        register(new SubjectFactory());
        register(new AuthInjectionBinder());
        register(new ShiroExceptionMapper());

        register(new HelloWorldResource());
        register(new AuthResource());
	}
}
