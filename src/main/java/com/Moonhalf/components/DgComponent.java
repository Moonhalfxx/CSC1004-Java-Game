package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.entity.components.ViewComponent;
import com.almasb.fxgl.texture.Texture;
import javafx.scene.Node;
import javafx.scene.paint.Color;

import static com.almasb.fxgl.dsl.FXGL.spawn;
import static com.almasb.fxgl.dsl.FXGL.*;

public class DgComponent extends Component {
    public int[] i = {1};
    @Override
    public void onAdded() {
        int[] j = {0};
        j[0] = FXGL.geti("green");
        Texture dg = FXGL.texture("Stage1/DG.png",120,255).toColor(Color.web("#638a7e"));
        ViewComponent vc = entity.getViewComponent();
            vc.addOnClickHandler(event ->{
                vc.clearChildren();
                if(i[0] == 1) {
                    vc.addChild(dg.toColor(Color.web("#e37a80")));
                    i[0]++;
                    j[0]=1;
                    FXGL.set("green",j[0]);
                }
                else if(i[0] == 2) {
                    vc.addChild(dg.toColor(Color.web("#e7d192")));
                    i[0]++;
                    j[0]=2;
                    FXGL.set("green",j[0]);
                }
                else if(i[0] == 3){
                    vc.addChild(dg.toColor(Color.web("#357aa1")));
                    i[0]++;
                    j[0]=3;
                    FXGL.set("green",j[0]);
                }
                else if(i[0] == 4){
                    vc.addChild(dg.toColor(Color.web("#638a7e")));
                    i[0] = 1;
                    j[0]=4;
                    FXGL.set("green",j[0]);
                }
        });
    }
}
