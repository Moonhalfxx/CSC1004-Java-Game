package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;

public class CurtainComponent extends Component {
    @Override
    public void onAdded() {
        int[] j = {0};
        j[0] = FXGL.geti("curtain");
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        Node curtain = entity.getViewComponent().getChildren().get(0);
        curtain.setOnMouseClicked(mouseEvent -> {
            int[] i = {0};
            i[0] = FXGL.geti("scissors");
            if(cm[0] == 0) {
                if (i[0] == 1) {
                    entity.removeFromWorld();
                    FXGL.play("拉窗帘声.wav");
                    Entity c1 = FXGL.spawn("c1");

                    if (j[0] == 0) {
                        FXGL.showMessage("Cloth strip*1");
                        FXGL.set("cloth strip", 1);
                        j[0]++;
                        FXGL.set("curtain", j[0]);
                    }

                    c1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                        FXGL.spawn("c2");
                        c1.removeFromWorld();
                    });
                } else if (i[0] == 0) {
                    FXGL.showMessage("The curtains are sewn together");
                }
            }
            if(cm[0] == 1){
                FXGL.showMessage("呃，如果你不想记忆的话，其实也可以，我会在适当的地方提醒你的");
                FXGL.showMessage("好吧...总之，你看见了蓝色窗户上标注的Ⅰ");
                FXGL.play("镜子布.wav");
                FXGL.showMessage("等等！我的意思是，我可以帮你把窗帘剪开，不是让你窗帘下面钻进去啊啊啊！");
                FXGL.showMessage("窗帘被缝住了，你打不开...虽然我很想这么说，但是你绝对不会被这种东西拦住，是吗？");
            }
        });
    }
}
