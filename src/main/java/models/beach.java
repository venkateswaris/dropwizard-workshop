package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import controller.View;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Random;

@Getter
@NoArgsConstructor
public class Beach {

    static Random random = new Random(1000);

    private Long id;

    @JsonView(View.Beach.class)
    @NotEmpty
    private String name;

    @JsonCreator
    public Beach(@JsonProperty("name") String name) {
        this.id = random.nextLong();
        this.name = name;
    }
}
