package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class ChairComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        Node chair = entity.getViewComponent().getChildren().get(0);
        chair.setOnMouseClicked(mouseEvent -> {
            FXGL.play("椅子.wav");
            if(cm[0] == 0) {
                FXGL.showMessage("K");
            }
            else if(cm[0] == 1){
                FXGL.showMessage("一个平平无奇的K...或许你意识到了什么？");
            }
        });
    }
}
