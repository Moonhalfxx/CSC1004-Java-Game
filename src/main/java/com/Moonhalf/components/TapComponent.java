package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class TapComponent extends Component {
    @Override
    public void onAdded() {
        Entity tap = entity.getViewComponent().getEntity();
        tap.getViewComponent().addOnClickHandler(mouseEvent -> {
                entity.removeFromWorld();
                Entity tapc1 = FXGL.spawn("tapc1");
                tapc1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                    tapc1.removeFromWorld();
                    Entity tapc2 = FXGL.spawn("tapc2");
                    tapc2.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                        FXGL.showMessage("The note said:'How are you, Kailyn?'");
                    });
                });
        });
    }
}
