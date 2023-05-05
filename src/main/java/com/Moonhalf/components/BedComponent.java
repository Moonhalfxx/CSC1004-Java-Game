package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class BedComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");


        Entity bed = entity.getViewComponent().getEntity();
        bed.getViewComponent().addOnClickHandler(mouseEvent -> {
            int[] j = {0};
            j[0] = FXGL.geti("gloves");
            if(cm[0] ==0) {
                if (j[0] == 1) {
                    entity.removeFromWorld();
                    FXGL.play("被子声.wav");
                    Entity bedc = FXGL.spawn("bedc");
                } else
                    FXGL.showMessage("This is Echo's bed, it's better not to touch it casually");
            }
            else if(cm[0]==1){
                entity.removeFromWorld();
                FXGL.play("被子声.wav");
                Entity bedc = FXGL.spawn("bedc");
                FXGL.showMessage("Echo应该不会怪你乱动她的床的..我猜");
            }
        });
    }
}
