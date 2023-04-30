package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

import static com.almasb.fxgl.dsl.FXGL.*;

public class YugangComponent extends Component {
    @Override
    public void onAdded() {
        int[] i = {0};
        i[0] = geti("cloth strip");
        Entity yugang = entity.getViewComponent().getEntity();
        yugang.getViewComponent().addOnClickHandler(mouseEvent -> {
            Entity yugangc = spawn("yugangc");
            Entity ard = spawn("arrowD");
            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                yugangc.removeFromWorld();
                ard.removeFromWorld();
            });

            yugangc.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                if(i[0] == 0)
                showMessage("Nothing happens");
                else if(i[0] == 1) {
                    yugangc.removeFromWorld();
                    Entity yugangc1 = spawn("yugangc1");
                    Entity ard1 = spawn("arrowD");
                    ard1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                        yugangc1.removeFromWorld();
                        ard1.removeFromWorld();
                    });
                    yugangc1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                        yugangc1.removeFromWorld();
                        Entity yugangc2 = spawn("yugangc2");
                        Entity ard2 = spawn("arrowD");
                        ard2.getViewComponent().addOnClickHandler(mouseEvent3 -> {
                            yugangc2.removeFromWorld();
                            ard2.removeFromWorld();
                        });
                        yugangc2.getViewComponent().addOnClickHandler(mouseEvent3 -> {
                            showMessage("Ⅱ");
                        });
                    });
                }
            });
        });
    }
}
