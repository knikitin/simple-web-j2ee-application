package com.my;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/fruits")
public class MyResource {

    @GET
    public String get() throws NamingException {
        System.out.println("GET");
        Context iniCtx = new InitialContext();
        Context compEnv = (Context) iniCtx.lookup("java:comp/env");
        String webmasterName = (String) compEnv.lookup("baseFolder");
        return webmasterName;
    }
}
