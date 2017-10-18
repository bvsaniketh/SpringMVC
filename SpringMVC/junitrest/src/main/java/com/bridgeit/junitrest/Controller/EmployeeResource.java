package com.bridgeit.junitrest.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bridgeit.junitrest.Model.Employee;

@Path("/employee")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Employee getEmployee(@PathParam("id") long id)
	{
		Employee emp=new Employee();
		emp.setId(id);
		emp.setFirstname("Aniketh");
		emp.setLastname("Bondada");
		emp.setDesignation("Messing Up");
		return emp;
	}
}
