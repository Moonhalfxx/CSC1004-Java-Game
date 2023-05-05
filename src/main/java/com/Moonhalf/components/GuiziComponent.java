package com.Moonhalf.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.component.Component;
import static com.almasb.fxgl.dsl.FXGL.*;

public class GuiziComponent extends Component {
    @Override
    public void onAdded() {
        int[] cm = {0};
        cm[0] = FXGL.geti("cm");
        int[] gz = {0};
        gz[0] = geti("guizi");
        Entity guizi = entity.getViewComponent().getEntity();
        guizi.getViewComponent().addOnClickHandler(mouseEvent -> {
            Entity guizic1 = spawn("guizic1");
            Entity chouti = spawn("chouti",new SpawnData(210,170));

            Entity Do = spawn("Do");
            Entity Re = spawn("Re");
            Entity Mi = spawn("Mi");
            Entity Fa = spawn("Fa");
            Entity So = spawn("So");
            Entity La = spawn("La");
            Entity Ti = spawn("Ti");
            Entity Do1 = spawn("Do1");
            Entity Re1 = spawn("Re1");
            Entity Mi1 = spawn("Mi1");
            Entity Fa1 = spawn("Fa1");
            Entity So1 = spawn("So1");

            //a->l 依次对应Do->So1
            int[] a = {0};int[] b = {0};int[] c = {0};int[] d = {0};int[] e = {0};int[] f = {0};
            int[] g = {0};int[] h = {0};int[] i = {0};int[] j = {0};int[] k = {0};int[] l = {0};

            Do.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                a[0]++;
                play("Do.wav");
            });
            Re.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                b[0]++;
                play("Re.wav");
            });
            Mi.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                c[0]++;
                play("Mi.wav");
            });
            Fa.getViewComponent().addOnClickHandler(mouseEvent1 ->
                {d[0]++;
                play("Fa.wav");
            });
            So.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                e[0]++;
                play("So.wav");
            });
            La.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                f[0]++
                        ;play("La.wav");
            });
            Ti.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                g[0]++;
                play("Ti.wav");
            });
            Do1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                h[0]++;
                play("Do1.wav");
            });
            Re1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                i[0]++;
                play("Re1.wav");
            });
            Mi1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                j[0]++;
                play("Mi1.wav");
            });
            Fa1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                k[0]++;
                play("Fa1.wav");
            });
            So1.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                l[0]++;
                play("So1.wav");
            });

/*            if(d[0] == 1 & a[0] == 0 & b[0] == 0 & c[0]==0 &e[0]==0&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){
                if(d[0] == 1 & a[0] == 0 & b[0] == 0 & c[0]==1 &e[0]==0&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){
                    if(d[0] == 1 & a[0] == 0 & b[0] == 0 & c[0]==1 &e[0]==0&f[0]==1&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0) {
                        if(d[0] == 2 & a[0] == 0 & b[0] == 0 & c[0]==1 &e[0]==0&f[0]==1&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){
                            if(d[0] == 2 & a[0] == 1 & b[0] == 0 & c[0]==1 &e[0]==0&f[0]==1&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){
                                showMessage("Gloves*1");
                            }
                        }
                    }
                }
            }*/

/*            if(d[0] == 1 & a[0] == 0 & b[0] == 0 & c[0]==0 &e[0]==0&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){ d[0] = 20;
                System.out.println(d[0]);}
            if(d[0] == 20 & a[0] == 0 & b[0] == 0 & c[0]==1 &e[0]==0&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){ c[0] = 20;
                System.out.println(c[0]);}
            if(d[0] == 20 & a[0] == 0 & b[0] == 0 & c[0]==20 &e[0]==1&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){ e[0] = 20;
                System.out.println(e[0]);}
            if(d[0] == 21 & a[0] == 0 & b[0] == 0 & c[0]==20 &e[0]==20&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){ d[0] = 30;
                System.out.println(d[0]);}
            if(d[0] ==30 & a[0] == 1 & b[0] == 0 & c[0]==20 &e[0]==20&f[0]==0&g[0]==0&h[0]==0&i[0]==0&j[0]==0&k[0]==0&l[0]==0){
                System.out.println(a[0]);
                showMessage("Gloves*1");
            }*/

            int[] umm = {0};

            chouti.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                if(cm[0] == 0) {
                    if (d[0] == 2 & a[0] == 1 & b[0] == 0 & c[0] == 1 & e[0] == 1 & f[0] == 0 & g[0] == 0 & h[0] == 0 & i[0] == 0 & j[0] == 0 & k[0] == 0 & l[0] == 0) {
                        if (gz[0] == 0) {
                            showMessage("Key*1");
                            inc("drawerkey2", 1);
                            FXGL.play("钥匙声.wav");
                            gz[0]++;
                            set("guizi", gz[0]);
                        } else
                            showMessage("Empty");
                    } else if (umm[0] < 5) {
                        showMessage("The cabinet doesn't seem to like the music you're playing");
                        umm[0]++;
                    } else {
                        showMessage("'Stop!' the cabinet shouted.");
                        getNotificationService().pushNotification("Achievement: 人嫌机厌");
                    }
                }
                else if(cm[0] == 1){
                    FXGL.play("钥匙声.wav");
                    FXGL.showMessage("嗯，这把钥匙对应的柜子你应该打开过了吧？");
                    FXGL.showMessage("柜子不满的看着你，但还是给出了一把钥匙...你遗憾的收回了拳头");
                    FXGL.showMessage("Key*1");
                }
            });

            Entity ard = spawn("arrowD");
            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                guizic1.removeFromWorld();
                ard.removeFromWorld();
                chouti.removeFromWorld();
                Do.removeFromWorld();
                Re.removeFromWorld();
                Mi.removeFromWorld();
                Fa.removeFromWorld();
                So.removeFromWorld();
                La.removeFromWorld();
                Ti.removeFromWorld();
                Do1.removeFromWorld();
                Re1.removeFromWorld();
                Mi1.removeFromWorld();
                Fa1.removeFromWorld();
                So1.removeFromWorld();
            });
        });

    }
}
