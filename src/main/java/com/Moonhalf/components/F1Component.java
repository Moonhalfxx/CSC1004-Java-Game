package com.Moonhalf.components;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import static com.almasb.fxgl.dsl.FXGL.*;

public class F1Component extends Component {
    @Override
    public void onAdded() {
        int[] i = {0};
        int[] j = {0};

        Entity f1 = entity.getViewComponent().getEntity();
        f1.getViewComponent().addOnClickHandler(mouseEvent ->{
            entity.removeFromWorld();
            Entity f2 = spawn("f2");
            f2.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                f2.removeFromWorld();
                Entity f3 = spawn("f3");
                f3.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    f3.removeFromWorld();
                    Entity f4 = spawn("f4");
                    f4.getViewComponent().addOnClickHandler(mouseEvent3 -> {
                        f4.removeFromWorld();
                        Entity f5 = spawn("f5");
                        f5.getViewComponent().addOnClickHandler(mouseEvent4 -> {
                            f5.removeFromWorld();
                            Entity f6 = spawn("f6");
                            f6.getViewComponent().addOnClickHandler(mouseEvent5 -> {
                                f6.removeFromWorld();
                                Entity f = spawn("f");
                                f.getViewComponent().addOnClickHandler(mouseEvent6 ->{
                                    if(i[0] == 0){
                                        showMessage("*The End*");
                                        i[0]++;
                                    }
                                    else if(i[0] == 1){
                                        showMessage("Do you find Echo?");
                                        i[0]++;
                                    }
                                    else if(i[0] == 2) {
                                        if(j[0] < 3){
                                        showMessage("请自行退出游戏~");
                                        j[0]++;
                                        }
                                        else if(j[0] < 5 ){
                                            showMessage("...你在期待些什么");
                                            j[0]++;
                                        }
                                        else if(j[0] == 5){
                                            showMessage("好吧，你赢了");
                                            getNotificationService().pushNotification("Achievement: 真正的赢家...?");
                                            j[0]++;
                                        }
                                        else if(j[0] == 6){
                                            showMessage("这回真的没有了，自行退出游戏哦~");
                                        }
                                    }
                                });
                            });
                        });
                    });
                });
            });
                });
    }
}
