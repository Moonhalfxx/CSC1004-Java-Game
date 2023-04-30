package com.Moonhalf.components;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

import static com.almasb.fxgl.dsl.FXGL.*;

public class ArrowR4Component extends Component {
    @Override
    public void onAdded() {
        Node ar = entity.getViewComponent().getChildren().get(0);
        ar.setOnMouseClicked(mouseEvent -> {
            Entity bg = spawn("bg");
            Entity mirror = spawn("mirror");
            Entity guahua = spawn("guahua");
            Entity tap = spawn("tap");
            Entity guizi = spawn("guizi");
            Entity yugang = spawn("yugang");
            Entity ar3 = spawn("arrowR3");
            Entity al3 = spawn("arrowL3");
            al3.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                bg.removeFromWorld();
                mirror.removeFromWorld();
                guahua.removeFromWorld();
                guizi.removeFromWorld();
                yugang.removeFromWorld();
                tap.removeFromWorld();
                ar3.removeFromWorld();
                al3.removeFromWorld();
            });
        });
    }
}
