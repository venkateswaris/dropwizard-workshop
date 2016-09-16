package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Path("/beach")
@Produces(MediaType.APPLICATION_JSON)
public class BeachResource {

    @GET
    public List<String> all(){
        return newArrayList("marina beach","thiruvanmiyur beach");
    }

}
