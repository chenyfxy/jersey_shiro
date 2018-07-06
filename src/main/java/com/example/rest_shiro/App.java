package com.example.rest_shiro;

import java.net.URI;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

public class App {
	public static void main(String[] args) {
		JettyHttpContainerFactory.createServer(URI.create("http://localhost:8082/"), new ExampleApplication());
	}
}
