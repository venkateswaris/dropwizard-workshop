package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Random;

public class Beach {

    static Random random = new Random(1000);

    @JsonIgnore
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Beach(String name) {
        this.id = random.nextLong();
        this.name = name;
    }
}
