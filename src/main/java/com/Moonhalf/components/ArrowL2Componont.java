package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

import static com.almasb.fxgl.dsl.FXGL.spawn;

public class ArrowL2Componont extends Component {
    @Override
    public void onAdded() {
        //move to the third stage
        Node ar = entity.getViewComponent().getChildren().get(0);
        ar.setOnMouseClicked(mouseEvent -> {
            Entity bg = spawn("bg");
            Entity mirror = spawn("mirror");
            Entity tap = spawn("tap");
            Entity guahua = spawn("guahua");
            Entity yugang= spawn("yugang");
            Entity guizi = spawn("guizi");
            Entity ar3 = spawn("arrowR3");
            Entity al3 = spawn("arrowL3");
            //arrowL in stage3, move to the stage4
            al3.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                bg.removeFromWorld();
                mirror.removeFromWorld();
                tap.removeFromWorld();
                guahua.removeFromWorld();
                yugang.removeFromWorld();
                guizi.removeFromWorld();
                ar3.removeFromWorld();
                al3.removeFromWorld();
                FXGL.spawn("bg");
                FXGL.spawn("bed");
                FXGL.spawn("box");
                FXGL.spawn("clock2");
                FXGL.spawn("arrowR4");
                FXGL.spawn("arrowL4");
            });
        });
    }
}
