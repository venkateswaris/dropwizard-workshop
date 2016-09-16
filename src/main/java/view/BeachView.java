package view;

import io.dropwizard.views.View;
import lombok.Getter;
import models.Beach;
@Getter
public class BeachView extends View {

    private final Beach beach;

    public BeachView(Beach beach) {

        super("beach.ftl");
        this.beach = beach;
    }
}

