package com.Moonhalf.components;

import com.almasb.fxgl.cutscene.Cutscene;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class LetterComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");
        Entity letter = entity.getViewComponent().getEntity();
        letter.getViewComponent().addOnClickHandler(mouseEvent -> {
            FXGL.play("箱子 纸声.wav");
            Entity letterbg = FXGL.spawn("letterbg");
            Entity paper = FXGL.spawn("paper",100,100);
            Entity ard = FXGL.spawn("arrowD");

            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                ard.removeFromWorld();
                paper.removeFromWorld();
                letterbg.removeFromWorld();
            });

            paper.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                if(cm[0] == 0) {
                    FXGL.showMessage("玩原神玩的");
                }
                else if(cm[0] == 1){
                    FXGL.showMessage("但是这跟开了作弊模式的你没有什么关系，你只需要欣赏一下作者简陋的美术作品owo");
                    FXGL.showMessage("很明显，这是一张标有线索的纸。");
                }
            });
        });
    }
}
