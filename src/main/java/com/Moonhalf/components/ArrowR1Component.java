package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class ArrowR1Component extends Component {
    @Override
    public void onAdded() {
        Node ar= entity.getViewComponent().getChildren().get(0);
        ar.setOnMouseClicked(mouseEvent -> {
            Entity bg = FXGL.spawn("bg");
            Entity bed = FXGL.spawn("bed");
            Entity box = FXGL.spawn("box");
            Entity clock = FXGL.spawn("clock2");
            Entity ar4 = FXGL.spawn("arrowR4");
            Entity al4 = FXGL.spawn("arrowL4");

            al4.getViewComponent().addOnClickHandler(mouseEvent1 -> {
               bg.removeFromWorld();
               bed.removeFromWorld();
               box.removeFromWorld();
               clock.removeFromWorld();
               ar4.removeFromWorld();
               al4.removeFromWorld();
            });
        });
    }
}
