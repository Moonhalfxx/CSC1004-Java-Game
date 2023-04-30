package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.entity.components.ViewComponent;
import com.almasb.fxgl.texture.Texture;
import javafx.scene.paint.Color;

public class DyComponent extends Component {
    /*i用来实现颜色转变，非游戏变量
       ps:其实不用public，但是写都写了，懒得变了
     */
    public int[] i = {1};
    @Override
    public void onAdded() {
        //j用来实现解锁条件，游戏变量
        int[] j = {0};
        j[0] = FXGL.geti("yellow");

        Texture dy = FXGL.texture("Stage1/DY.png",120,255).toColor(Color.web("#e7d192"));
        ViewComponent vc = entity.getViewComponent();
        vc.addOnClickHandler(event ->{
            vc.clearChildren();
            if(i[0] == 1) {
                vc.addChild(dy.toColor(Color.web("#357aa1")));
                i[0]++;
                j[0]=3;
                FXGL.set("yellow",j[0]);
            }
            else if(i[0] == 2) {
                vc.addChild(dy.toColor(Color.web("#638a7e")));
                i[0]++;
                j[0]=4;
                FXGL.set("yellow",j[0]);
            }
            else if(i[0] == 3){
                vc.addChild(dy.toColor(Color.web("#e37a80")));
                i[0]++;
                j[0]=1;
                FXGL.set("yellow",j[0]);
            }
            else if(i[0] == 4){
                vc.addChild(dy.toColor(Color.web("#e7d192")));
                i[0] = 1;
                j[0]=2;
                FXGL.set("yellow",j[0]);
            }
        });
    }
}
