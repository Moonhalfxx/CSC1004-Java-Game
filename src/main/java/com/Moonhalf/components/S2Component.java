package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class S2Component extends Component {
    @Override
    public void onAdded() {
        Entity s2 = entity.getViewComponent().getEntity();
        s2.getViewComponent().addOnClickHandler(mouseEvent -> {
            entity.removeFromWorld();
            Entity s3 = FXGL.spawn("s3");
            s3.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                s3.removeFromWorld();
            });
        });
    }
}
