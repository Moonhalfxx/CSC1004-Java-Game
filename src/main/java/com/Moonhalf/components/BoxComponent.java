package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class BoxComponent extends Component {
    @Override
    public void onAdded() {
        Node box = entity.getViewComponent().getChildren().get(0);
        box.setOnMouseClicked(mouseEvent -> {
            Entity mengban = FXGL.spawn("mengban");
            Entity painting = FXGL.spawn("painting");
            Entity ard = FXGL.spawn("arrowD");
            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                mengban.removeFromWorld();
                painting.removeFromWorld();
                ard.removeFromWorld();
            });
            painting.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                FXGL.showMessage("I like this painting, Echo is my best friend");
            });
        });
    }
}
