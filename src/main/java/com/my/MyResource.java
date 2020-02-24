package com.my;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.*;

@Path("/fruit")
public class MyResource {

    @GET
    public String get() throws NamingException {
        System.out.println("GET");
        Context iniCtx = new InitialContext();
        Context compEnv = (Context) iniCtx.lookup("java:comp/env");
        String webmasterName = (String) compEnv.lookup("baseFolder");
        return webmasterName;
//            return "dd";
    }
}


// <env-entry>
// <env-entry-name>webmasterName</env-entry-name>
// <env-entry-value>Ms. W. Master</env-entry-value>
// <env-entry-type>java.lang.String</env-entry-type>
// </env-entry>