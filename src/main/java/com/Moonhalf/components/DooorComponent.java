package com.Moonhalf.components;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;
import static com.almasb.fxgl.dsl.FXGL.*;

public class DooorComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm1 = {0};
        int[] cm = {0};
        cm[0] = geti("cm");

        Node door = entity.getViewComponent().getChildren().get(0);
        door.setOnMouseClicked(mouseEvent -> {
            Entity doorclick = spawn("doorclick");
            Entity dr = spawn("dr",new SpawnData(190,250));
            Entity dy = spawn("dy",new SpawnData(325,255));
            Entity db = spawn("db",new SpawnData(460,250));
            Entity dg = spawn("dg",new SpawnData(595,260));

            doorclick.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                //i j k m -> 红 黄 蓝 绿
                int[] i = {0};
                i[0] = geti("red");
                int[] j = {0};
                j[0] = geti("yellow");
                int[] k = {0};
                k[0] = geti("blue");
                int[] m = {0};
                m[0] = geti("green");

                if(cm[0] == 0) {
                    if (i[0] == 3 & j[0] == 4 & k[0] == 1 & m[0] == 2) {
                        spawn("f1");
                        play("开门声.wav");
                    } else {
                        showMessage("I haven't found the Echo yet, I shouldn't have left");
                        play("敲门声.wav");
                    }
                }
                else if(cm[0] == 1){
                    if (i[0] == 3 & j[0] == 4 & k[0] == 1 & m[0] == 2) {
                        spawn("f1");
                        play("开门声.wav");
                    } else {
                        if(cm1[0] == 0) {
                            showMessage("你真的想就这么出去吗？");
                            play("敲门声.wav");
                            cm1[0]++;
                        }
                        else if(cm1[0] == 1)
                            showMessage("好吧，每个按钮各点两下就可以了，再见啦~");
                    }
                }
            });

            Entity arrowD = spawn("arrowD");
            arrowD.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                doorclick.removeFromWorld();
                arrowD.removeFromWorld();
                dr.removeFromWorld();
                dy.removeFromWorld();
                db.removeFromWorld();
                dg.removeFromWorld();
            });

            });
        };
}
