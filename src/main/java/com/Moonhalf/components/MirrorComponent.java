package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class MirrorComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        Node mirror = entity.getViewComponent().getChildren().get(0);
        final double[] i = {0};
        mirror.setOnMouseClicked(mouseEvent -> {
            if(cm[0] == 0) {
                if (i[0] < 5) {
                    FXGL.play("镜子布.wav");
                    FXGL.showMessage("Covered in cloth...why?");
                    i[0]++;
                } else if (i[0] == 5) {
                    FXGL.showMessage("Stop doing this!! Just click other things!!");
                    FXGL.getNotificationService().pushNotification("Achievement: 百折不挠");
                    i[0]++;
                } else {
                    FXGL.showMessage("Stop doing this!! Just click other things!!");
                }
            }
            else if(cm[0] == 1){
                FXGL.play("镜子布.wav");
                FXGL.showMessage("被布包住了...你应该知道是为什么吧？");
            }
        });
    }
}
