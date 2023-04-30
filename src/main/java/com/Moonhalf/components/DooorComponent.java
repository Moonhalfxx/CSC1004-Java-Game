package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;
import static com.almasb.fxgl.dsl.FXGL.*;

public class DooorComponent extends Component {
    @Override
    public void onAdded() {
        Node door = entity.getViewComponent().getChildren().get(0);
        door.setOnMouseClicked(mouseEvent -> {
            Entity doorclick = spawn("doorclick");
            Entity dr = spawn("dr",new SpawnData(190,250));
            Entity dy = spawn("dy",new SpawnData(325,255));
            Entity db = spawn("db",new SpawnData(460,250));
            Entity dg = spawn("dg",new SpawnData(595,260));
            Entity arrowD = spawn("arrowD");
            arrowD.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                doorclick.removeFromWorld();
                arrowD.removeFromWorld();
                dr.removeFromWorld();
                dy.removeFromWorld();
                db.removeFromWorld();
                dg.removeFromWorld();
            });

            });
        };
}
