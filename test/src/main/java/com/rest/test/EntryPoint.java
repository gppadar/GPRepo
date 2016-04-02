package com.rest.test;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
@Path("/entry-point")
public class EntryPoint {
 public static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);
   
 @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
	 	logger.info("Received GET request.....");
	 	logger.debug("Debug.....");
        return "Test";
    }
    
    @POST
	@Path("addTest")
	@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_JSON)
	public String addTestMethod(String pojo) {
	 	logger.info("Received POST request.....");
	 	logger.debug("Debug.....");
    	return pojo;
	}
}