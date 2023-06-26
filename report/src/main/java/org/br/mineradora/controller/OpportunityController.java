package org.br.mineradora.controller;

import io.quarkus.security.Authenticated;
import org.br.mineradora.dto.OpportunityDTO;
import org.br.mineradora.service.OpportunityService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/api/opportunity")
@Authenticated
public class OpportunityController {

    @Inject
    OpportunityService opportunityService;

    @GET
    @Path("/data")
    public List<OpportunityDTO> generateReport(){

        return opportunityService.generateOpportunityData();

    }

}
