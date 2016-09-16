package controller;

import App.View;
import com.fasterxml.jackson.annotation.JsonView;
import models.Beach;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;

@Path("/beach")
@Produces(MediaType.APPLICATION_JSON)
public class BeachResource {

    @GET
    @JsonView(View.Beach.class)
    public ArrayList<Beach> all(){
        return newArrayList(new Beach("marina beach"),new Beach("thiruvanmiyur beach"));
    }

}
