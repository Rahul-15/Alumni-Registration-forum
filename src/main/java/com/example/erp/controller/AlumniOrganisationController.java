package com.example.erp.controller;

import com.example.erp.bean.RequestBodyOrg;
import com.example.erp.bean.Students;
import com.example.erp.bean.alumniOrganisation;
import com.example.erp.service.AlumniOrganisationServices;
import com.example.erp.service.AlumniServices;
import com.example.erp.service.StudentService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("organisation")
public class AlumniOrganisationController {
    AlumniOrganisationServices alumniOrganisationServices = new AlumniOrganisationServices();
    AlumniServices alumniServices = new AlumniServices();
    StudentService studentService = new StudentService();

    @POST
    @Path("/details")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public Response registerOrganisation(RequestBodyOrg requestBodyOrg)throws URISyntaxException {

        System.out.println("I am in.................");
        System.out.println(requestBodyOrg.getId()+"this is id");
        Integer jy = Integer.parseInt(requestBodyOrg.getJoining_Year());
        Integer ly = Integer.parseInt(requestBodyOrg.getLeaving_Year());

        Students students = studentService.getStudentByID(requestBodyOrg.getId());
        alumniOrganisation alumniOrganisation = new alumniOrganisation(requestBodyOrg.getOrganisation_Name(),requestBodyOrg.getPostion(),jy,ly);


        if(alumniOrganisationServices.registerOrganisation(alumniOrganisation) &&
                alumniServices.updateAlumni(students.getAlumni().getAlumni_id(),alumniOrganisation)){
            return Response.ok().build();
        }
        return Response.status(203).build();
    }
}
