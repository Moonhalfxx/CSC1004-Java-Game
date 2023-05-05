package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class TapComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        Entity tap = entity.getViewComponent().getEntity();
        tap.getViewComponent().addOnClickHandler(mouseEvent -> {
                entity.removeFromWorld();
                Entity tapc1 = FXGL.spawn("tapc1");
                tapc1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                    tapc1.removeFromWorld();
                    Entity tapc2 = FXGL.spawn("tapc2");
                    tapc2.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                        if(cm[0] == 0) {
                            FXGL.showMessage("The note said:'How are you, Kailyn?'");
                        }
                        else if(cm[0] == 1){
                            FXGL.showMessage("'为什么是Kailyn?'，我猜你在这么想，是吗？");
                            FXGL.showMessage("The note said:'How are you, Kailyn?'");
                        }
                    });
                });
        });
    }
}
