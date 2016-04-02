package com.rest.test;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/gpTest")
public class JsonTest {

	@POST
	@Path("addTest")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public TestPojo addTestMethod(TestPojo pojo,
			@Context HttpServletRequest httpServletRequest) {
		return pojo;

	}
}
