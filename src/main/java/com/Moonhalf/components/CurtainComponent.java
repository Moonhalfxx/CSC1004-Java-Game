package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class CurtainComponent extends Component {
    @Override
    public void onAdded() {
        Node curtain= entity.getViewComponent().getChildren().get(0);
        curtain.setOnMouseClicked(mouseEvent -> {
            entity.removeFromWorld();
            Entity c1 = FXGL.spawn("c1");
            c1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                FXGL.spawn("c2");
                c1.removeFromWorld();
            });
    });
    }
}
