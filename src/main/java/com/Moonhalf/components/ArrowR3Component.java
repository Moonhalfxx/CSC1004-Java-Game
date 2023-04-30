package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

import static com.almasb.fxgl.dsl.FXGL.spawn;

public class ArrowR3Component extends Component {
    @Override
    public void onAdded() {
        Node ar= entity.getViewComponent().getChildren().get(0);
        final double[] i = {0};
        ar.setOnMouseClicked(mouseEvent -> {
            Entity bg = spawn("bg");
            Entity chair = spawn("chair");
            Entity clock = spawn("clock1");
            Entity drawer = spawn("drawer");
            Entity arrowL2 = spawn("arrowL2");
            Entity arrowR2 = spawn("arrowR2");
            arrowR2.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                chair.removeFromWorld();
                clock.removeFromWorld();
                drawer.removeFromWorld();
                arrowL2.removeFromWorld();
                arrowR2.removeFromWorld();
                spawn("arrowL1");
                spawn("arrowR1");
                spawn("door",new SpawnData(550,400));
                spawn("curtain",new SpawnData(180,220));
            });
/*            drawer.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                Entity drawerclick = FXGL.spawn("drawerclick");
                Entity d1 = FXGL.spawn("d1");
                Entity d2 = FXGL.spawn("d2");
                Entity d3 = FXGL.spawn("d3");
                Entity d4 = FXGL.spawn("d4");
                Entity arrowD = spawn("arrowD");
                arrowD.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    drawerclick.removeFromWorld();
                    d1.removeFromWorld();
                    d2.removeFromWorld();
                    d3.removeFromWorld();
                    d4.removeFromWorld();
                    arrowD.removeFromWorld();
                });
                d1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    FXGL.showMessage("Empty");
                });
                d2.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    if(i[0] == 0){
                        FXGL.showMessage("Rag*1");
                        i[0]++;
                    }
                    else
                        FXGL.showMessage("Empty");
                });
                d3.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    FXGL.showMessage("Locked, need a key to open it");
                });
                d4.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    FXGL.showMessage("Locked, need a key to open it");
                });
            });*/
        });
    }
}
