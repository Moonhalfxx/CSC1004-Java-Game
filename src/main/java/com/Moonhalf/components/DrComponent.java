package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.entity.components.ViewComponent;
import com.almasb.fxgl.texture.Texture;
import javafx.scene.paint.Color;

public class DrComponent extends Component {
    public int[] i = {1};

    @Override
    public void onAdded() {
        int[] j = {0};
        j[0] = FXGL.geti("red");

        Texture dr = FXGL.texture("Stage1/DR.png").toColor(Color.web("#e37a80"));
        ViewComponent vc = entity.getViewComponent();
        vc.addOnClickHandler(event ->{
            vc.clearChildren();
            if(i[0] == 1) {
                vc.addChild(dr.toColor(Color.web("#e7d192")));
                i[0]++;
                j[0]=2;
                FXGL.set("red",j[0]);
            }
            else if(i[0] == 2) {
                vc.addChild(dr.toColor(Color.web("#357aa1")));
                i[0]++;
                j[0]=3;
                FXGL.set("red",j[0]);
            }
            else if(i[0] == 3){
                vc.addChild(dr.toColor(Color.web("#638a7e")));
                i[0]++;
                j[0]=4;
                FXGL.set("red",j[0]);
            }
            else if(i[0] == 4){
                vc.addChild(dr.toColor(Color.web("#e37a80")));
                i[0] = 1;
                j[0]=1;
                FXGL.set("red",j[0]);
            }
        });
    }
}
