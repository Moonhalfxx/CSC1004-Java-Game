package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.entity.components.ViewComponent;
import com.almasb.fxgl.texture.Texture;
import javafx.scene.paint.Color;

public class DbComponent extends Component {
    public int[] i = {1};
    @Override
    public void onAdded() {
        int[] j = {0};
        j[0] = FXGL.geti("blue");

        Texture db = FXGL.texture("Stage1/DB.png").toColor(Color.web("#638a7e"));
        ViewComponent vc = entity.getViewComponent();
        vc.addOnClickHandler(event ->{
            vc.clearChildren();
            if(i[0] == 1) {
                vc.addChild(db.toColor(Color.web("#638a7e")));
                i[0]++;
                j[0]=4;
                FXGL.set("blue",j[0]);
            }
            else if(i[0] == 2) {
                vc.addChild(db.toColor(Color.web("#e37a80")));
                i[0]++;
                j[0]=1;
                FXGL.set("blue",j[0]);
            }
            else if(i[0] == 3){
                vc.addChild(db.toColor(Color.web("#e7d192")));
                i[0]++;
                j[0]=2;
                FXGL.set("blue",j[0]);
            }
            else if(i[0] == 4){
                vc.addChild(db.toColor(Color.web("#357aa1")));
                i[0] = 1;
                j[0]=3;
                FXGL.set("blue",j[0]);
            }
        });
    }

}
