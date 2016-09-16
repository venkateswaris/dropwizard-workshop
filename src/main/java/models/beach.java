package models;

import controller.View;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Random;

@Getter
@NoArgsConstructor
public class Beach {

    static Random random = new Random(1000);

    private Long id;

    @JsonView(View.Beach.class)
    private String name;

    @JsonCreator
    public Beach(@JsonProperty("name") String name) {
        this.id = random.nextLong();
        this.name = name;
    }
}
