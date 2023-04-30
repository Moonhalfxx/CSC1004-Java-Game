package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class ChairComponent extends Component {
    @Override
    public void onAdded() {
        Node chair = entity.getViewComponent().getChildren().get(0);
        chair.setOnMouseClicked(mouseEvent -> {
            FXGL.showMessage("K");
        });
    }
}
