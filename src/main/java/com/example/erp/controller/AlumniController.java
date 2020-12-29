package com.example.erp.controller;


import com.example.erp.bean.RequestBody;
import com.example.erp.bean.alumni;
import com.example.erp.service.AlumniServices;
import com.example.erp.service.StudentService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("alumni")
public class AlumniController {
    AlumniServices alumniServices = new AlumniServices();
    StudentService studentService = new StudentService();

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)


    public Response registerAlumni(RequestBody requestBody) throws URISyntaxException {
        System.out.println("its running .................");
        System.out.println(requestBody.getId()+" its the id");

        Long number = Long.parseLong(requestBody.getContact_Number());
        alumni al = new alumni(requestBody.getEmail(),number);

        if(alumniServices.registerAlumni(al) && studentService.updateStudent(requestBody.getId(), al)){
            return Response.ok().build();
        }
        return Response.status(203).build();
    }
}
