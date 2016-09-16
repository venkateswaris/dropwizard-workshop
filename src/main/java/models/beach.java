package models;

import App.View;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;

import java.util.Random;

@Getter
public class Beach {

    static Random random = new Random(1000);

    private Long id;

    @JsonView(View.Beach.class)
    private String name;

    public Beach(String name) {
        this.id = random.nextLong();
        this.name = name;
    }
}
