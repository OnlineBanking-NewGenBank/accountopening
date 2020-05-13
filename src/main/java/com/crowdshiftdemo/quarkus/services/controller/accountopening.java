package com.crowdshiftdemo.quarkus.services.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.crowdshiftdemo.quarkus.services.model.AcountOpenRequest;
import com.crowdshiftdemo.quarkus.services.repository.MongoRepository;

@Path("/openaccount")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class accountopening {

    @Inject
    MongoRepository mongorepository;

    @GET
    public List<AcountOpenRequest> getCustomers() {
        return mongorepository.getCustomers();
    }

    @POST
    public List<AcountOpenRequest> openAccount(AcountOpenRequest accountopenrequest){

        mongorepository.add(accountopenrequest);
        return getCustomers();

    }
}