package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

import static com.almasb.fxgl.dsl.FXGL.*;

public class YugangComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");

        Entity yugang = entity.getViewComponent().getEntity();
        yugang.getViewComponent().addOnClickHandler(mouseEvent -> {
            FXGL.play("鱼缸.wav");
            Entity yugangc = spawn("yugangc");
            Entity ard = spawn("arrowD");
            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                yugangc.removeFromWorld();
                ard.removeFromWorld();
            });

            yugangc.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                int[] i = {0};
                i[0] = geti("cloth strip");
                if(cm[0] == 0) {
                    if (i[0] == 0) {
                        showMessage("Nothing happens");
                    } else if (i[0] == 1) {
                        yugangc.removeFromWorld();
                        FXGL.play("布条入水.wav");
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
                }
                else if(cm[0] == 1){
                    FXGL.showMessage("好嘛好嘛，布条本来会显示绿色的Ⅱ，别生气啦？");
                    FXGL.showMessage("别这么看着我啊，不小心的嘛");
                    FXGL.showMessage("但是布条好像被我扔掉了..");
                    FXGL.showMessage("唔，本来应该把布条浸到里面的...");
                }
            });
        });
    }
}
