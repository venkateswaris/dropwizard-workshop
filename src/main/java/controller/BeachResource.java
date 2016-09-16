package controller;

import com.fasterxml.jackson.annotation.JsonView;
import models.Beach;
import view.BeachView;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Path("/beach")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BeachResource {

    static List<Beach> beaches = newArrayList(new Beach("marina beach"), new Beach("thiruvanmiyur beach"));

    @GET
    @JsonView(View.Beach.class)
    public ArrayList<Beach> all() {
        return newArrayList(beaches);
    }

    @POST
    public Beach add(Beach newBeach) {
        beaches.add(newBeach);
        return newBeach;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_HTML)
    public BeachView get(@PathParam(value = "id") Long id) {
        return new BeachView(beaches.stream().filter(b -> b.getId().equals(id)).findFirst().get());
    }

}
