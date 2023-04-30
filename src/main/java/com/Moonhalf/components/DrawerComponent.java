package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

import static com.almasb.fxgl.dsl.FXGL.geti;
import static com.almasb.fxgl.dsl.FXGL.spawn;

public class DrawerComponent extends Component {

    @Override
    public void onAdded() {
        //i->拿扳手
        int[] i = new int[1];
        i[0] = FXGL.geti("drawer");
        //j->key1
        int[] j = new int[1];
        j[0] = FXGL.geti("drawerkey1");
        //j1->防止拿很多把剪刀
        int[] j1 = new int[1];
        j1[0] = geti("drawerkey11");
        //k->key2
        int[] k = new int[1];
        k[0] = FXGL.geti("drawerkey2");
        Entity drawer = entity.getViewComponent().getEntity();
        drawer.getViewComponent().addOnClickHandler(mouseEvent1 -> {
            Entity drawerclick = FXGL.spawn("drawerclick");
            Entity d1 = FXGL.spawn("d1");
            Entity d2 = FXGL.spawn("d2");
            Entity d3 = FXGL.spawn("d3");
            Entity d4 = FXGL.spawn("d4");
            Entity arrowD = spawn("arrowD");
            arrowD.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                drawerclick.removeFromWorld();
                d1.removeFromWorld();
                d2.removeFromWorld();
                d3.removeFromWorld();
                d4.removeFromWorld();
                arrowD.removeFromWorld();
            });
            d1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                FXGL.showMessage("Empty");
            });
            d2.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                if(i[0] == 0){
                    FXGL.showMessage("Wrench*1");
                    //增加扳手变量
                    FXGL.inc("wrench",1);
                    i[0]++;
                    //柜子变量，防止多次拾取wrench
                    FXGL.set("drawer",i[0]);
                }
                else
                    FXGL.showMessage("Empty");
            });
            d3.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                if(j[0] == 0)
                FXGL.showMessage("Locked, need a key to open it");
                else if (j[0] == 1) {
                    if(j1[0] == 0) {
                        FXGL.showMessage("scissors*1");
                        FXGL.inc("scissors", 1);
                        j1[0]++;
                        //防止多次拾取剪刀
                        FXGL.set("drawerkey11",j1[0]);
                    }
                    else if(j1[0] > 0)
                        FXGL.showMessage("Empty");
                }
            });
            d4.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                FXGL.showMessage("Locked, need a key to open it");
            });
        });
    }
}
