package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

import static com.almasb.fxgl.dsl.FXGL.*;

public class DrawerComponent extends Component {

    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        //i->拿扳手
        int[] i = new int[1];
        i[0] = FXGL.geti("drawer");

        //j1->防止拿很多把剪刀
        int[] j1 = new int[1];
        j1[0] = geti("drawerkey11");

        //k1->防止拿很多个手套
        int[] k1 = {0};
        k1[0] =geti("drawerkey22");
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
                FXGL.play("柜子开.wav");
                FXGL.showMessage("Empty");
            });
            d2.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                FXGL.play("柜子开.wav");
                if(cm[0] == 0) {
                    if (i[0] == 0) {
                        FXGL.showMessage("Wrench*1");
                        //增加扳手变量
                        FXGL.inc("wrench", 1);
                        i[0]++;
                        //柜子变量，防止多次拾取wrench
                        FXGL.set("drawer", i[0]);
                    } else {
                        FXGL.showMessage("Empty");
                    }
                }
                else if(cm[0] == 1){
                    FXGL.showMessage("一把扳手！或许你可以把视线移向左边，看到那副画了吗？");
                    FXGL.showMessage("Wrench*1");
                }
            });
            d3.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                //j->key1
                int[] j = new int[1];
                j[0] = FXGL.geti("drawerkey1");
                if(cm[0] == 0) {
                    if (j[0] == 0) {
                        FXGL.showMessage("Locked, need a key to open it");
                        FXGL.play("调钟表.wav");
                    } else if (j[0] == 1) {
                        FXGL.play("柜子开.wav");
                        if (j1[0] == 0) {
                            FXGL.showMessage("Scissors*1");
                            FXGL.inc("scissors", 1);
                            j1[0]++;
                            //防止多次拾取剪刀
                            FXGL.set("drawerkey11", j1[0]);
                        } else if (j1[0] > 0)
                            FXGL.showMessage("Empty");
                    }
                }
                else if (cm[0] == 1){
                    FXGL.play("柜子开.wav");
                    FXGL.showMessage("漂亮的剪刀，但是我猜你在窗户那已经提前用过它了，是吗？");
                    FXGL.showMessage("Scissors*1");
                }
            });
            d4.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                //k->key2
                int[] k = new int[1];
                k[0] = FXGL.geti("drawerkey2");

                if(cm[0] == 0) {
                    if (k[0] == 0) {
                        FXGL.showMessage("Locked, need a key to open it");
                        FXGL.play("调钟表.wav");
                    } else if (k[0] == 1) {
                        FXGL.play("柜子开.wav");
                        if (k1[0] == 0) {
                            showMessage("Gloves*1");
                            inc("gloves", 1);
                            k1[0]++;
                            set("drawerkey22", k1[0]);
                        } else if (k1[0] > 0)
                            showMessage("Empty");
                    }
                }
                else if(cm[0]==1){
                    FXGL.play("柜子开.wav");
                    showMessage("有了这双手套，碰别人的床就不会弄脏床了吧？");
                    showMessage("Gloves*1");
                }
            });
        });
    }
}
