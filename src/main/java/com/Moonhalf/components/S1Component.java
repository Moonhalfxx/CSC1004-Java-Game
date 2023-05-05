package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class S1Component extends Component {
    @Override
    public void onAdded() {
        Entity s1 = entity.getViewComponent().getEntity();
        s1.getViewComponent().addOnClickHandler(mouseEvent -> {
            entity.removeFromWorld();
            FXGL.spawn("s2");
        });
    }
}
