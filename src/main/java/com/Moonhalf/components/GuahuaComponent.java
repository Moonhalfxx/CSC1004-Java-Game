package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class GuahuaComponent extends Component{
    //还得加钉子的移除，暂且先这样放着
    @Override
    public void onAdded(){
        int[] wrench = {0};
        wrench[0] = FXGL.geti("wrench");
        int[] wrench1 = {0};
        wrench1[0] = FXGL.geti("wrench1");

        int[] m = {0};

        Node guahua = entity.getViewComponent().getChildren().get(0);
        guahua.setOnMouseClicked(mouseEvent -> {
            Entity guahuac1 = FXGL.spawn("guahuac1");
            Entity ard = FXGL.spawn("arrowD");
            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                guahuac1.removeFromWorld();
                ard.removeFromWorld();
            });
            guahuac1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                if (wrench[0] == 0)
                    FXGL.showMessage("The picture is pinned");
                else if (wrench[0] == 1) {
                    if (wrench1[0] == 0) {

                        wrench1[0]++;
                        FXGL.set("wrench1", wrench1[0]);

                        guahuac1.removeFromWorld();
                        ard.removeFromWorld();
                        Entity guahuac2 = FXGL.spawn("guahuac2");
                        Entity ard1 = FXGL.spawn("arrowD");

                        Entity Gy = FXGL.spawn("dy", new SpawnData(225, 400));
                        Entity Gg = FXGL.spawn("dg", new SpawnData(375, 405));
                        Entity Gr = FXGL.spawn("dr", new SpawnData(525, 400));

                        ard1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                            guahuac2.removeFromWorld();
                            ard1.removeFromWorld();
                            Gy.removeFromWorld();
                            Gg.removeFromWorld();
                            Gr.removeFromWorld();
                        });
                        guahuac2.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                            int[] i = {0};
                            int[] j = {0};
                            int[] k = {0};

                            i[0] = FXGL.geti("yellow");
                            j[0] = FXGL.geti("green");
                            k[0] = FXGL.geti("red");

                            if (i[0] == 1 & j[0] == 2 & k[0] == 4) {
                                if(m[0] == 0) {
                                    FXGL.showMessage("Key*1");
                                    FXGL.set("drawerkey1", 1);
                                    m[0]++;
                                }
                                else
                                    FXGL.showMessage("Empty");
                            }
                        });
                    }

                    else
                        FXGL.showMessage("Empty");
                }
            });
        });

    }
}

