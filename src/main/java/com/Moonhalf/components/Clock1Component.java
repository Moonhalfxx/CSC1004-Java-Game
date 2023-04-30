package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class Clock1Component extends Component {
    @Override
    public void onAdded() {
        Node clock = entity.getViewComponent().getChildren().get(0);
        clock.setOnMouseClicked(mouseEvent -> {
            FXGL.showMessage("06:00");
        });
    }
}
