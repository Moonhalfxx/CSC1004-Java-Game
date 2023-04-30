package com.Moonhalf.components;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

import static com.almasb.fxgl.dsl.FXGL.spawn;

public class ArrowL4Component extends Component {
    //从场景4转到场景1（从场景2那边过来）
    @Override
    public void onAdded() {
        Node ar = entity.getViewComponent().getChildren().get(0);
        ar.setOnMouseClicked(mouseEvent -> {
            spawn("bg");
            spawn("arrowR1");
            spawn("arrowL1");
            Entity door = spawn("door",new SpawnData(550,400));
            spawn("curtain",new SpawnData(180,220));
        });
    }
}
