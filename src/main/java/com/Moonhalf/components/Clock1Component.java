package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class Clock1Component extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");
        Node clock = entity.getViewComponent().getChildren().get(0);
        clock.setOnMouseClicked(mouseEvent -> {
            if(cm[0] == 0) {
                FXGL.play("闹钟声.wav");
                FXGL.showMessage("06:00");
            }
            else if(cm[0] == 1){
                FXGL.play("闹钟声.wav");
                FXGL.showMessage("六点，我想你平时应该不会在这个点起床...总之，去看看时钟吧？");
            }
        });
    }
}
