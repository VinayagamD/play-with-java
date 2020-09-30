package com.vinaylogics.jerseryapp.controllers;

import com.vinaylogics.jerseryapp.domain.DataType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloController {

    @GET
    public String dataTest(){
        return "data test";
    }

    @GET
    @Path("/{type}")
    public String dataType(@PathParam("type")DataType dataType){
        return dataType.name();
    }
}
