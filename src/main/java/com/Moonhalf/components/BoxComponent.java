package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class BoxComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        Node box = entity.getViewComponent().getChildren().get(0);
        box.setOnMouseClicked(mouseEvent -> {
            FXGL.play("箱子 纸声.wav");
            Entity mengban = FXGL.spawn("mengban");
            Entity painting = FXGL.spawn("painting");
            Entity ard = FXGL.spawn("arrowD");
            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                mengban.removeFromWorld();
                painting.removeFromWorld();
                ard.removeFromWorld();
            });
            painting.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                if(cm[0] == 0) {
                    FXGL.showMessage("I like this painting, Echo is my best friend");
                }
                else if(cm[0] == 1){
                    FXGL.showMessage("绿色的脑袋，我们亲密无间~");
                }
            });
        });
    }
}
