package com.Moonhalf.components;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import javafx.scene.Node;
import static com.almasb.fxgl.dsl.FXGL.*;

public class Clock2Component extends Component {
    @Override
    public void onAdded() {
        Node clock2 = entity.getViewComponent().getChildren().get(0);
        clock2.setOnMouseClicked(mouseEvent -> {
            Entity c0 = spawn("cl0");
            Entity ard = spawn("arrowD");

            ard.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                c0.removeFromWorld();;
                ard.removeFromWorld();
            });
            c0.getViewComponent().addOnClickHandler(mouseEvent1 -> {
                c0.removeFromWorld();
                ard.removeFromWorld();
                Entity c1 = spawn("cl1");
                Entity ard1 = spawn("arrowD");
                ard1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    c1.removeFromWorld();
                    ard1.removeFromWorld();
                });
                c1.getViewComponent().addOnClickHandler(mouseEvent2 -> {
                    c1.removeFromWorld();
                    ard1.removeFromWorld();
                    Entity c2 = spawn("cl2");
                    Entity ard2 = spawn("arrowD");
                    ard2.getViewComponent().addOnClickHandler(mouseEvent3 -> {
                        c2.removeFromWorld();
                        ard2.removeFromWorld();
                    });
                    c2.getViewComponent().addOnClickHandler(mouseEvent3 -> {
                        c2.removeFromWorld();
                        ard2.removeFromWorld();
                        Entity c3 = spawn("cl3");
                        Entity ard3 = spawn("arrowD");
                        ard3.getViewComponent().addOnClickHandler(mouseEvent4 -> {
                            c3.removeFromWorld();
                            ard3.removeFromWorld();
                        });
                        c3.getViewComponent().addOnClickHandler(mouseEvent4 -> {
                            c3.removeFromWorld();
                            ard3.removeFromWorld();
                            Entity c4 = spawn("cl4");
                            Entity ard4 = spawn("arrowD");
                            ard4.getViewComponent().addOnClickHandler(mouseEvent5 -> {
                                c4.removeFromWorld();
                                ard4.removeFromWorld();
                            });
                            c4.getViewComponent().addOnClickHandler(mouseEvent5 -> {
                                c4.removeFromWorld();
                                ard4.removeFromWorld();
                                Entity c5 = spawn("cl5");
                                Entity ard5 = spawn("arrowD");
                                ard5.getViewComponent().addOnClickHandler(mouseEvent6 -> {
                                    c5.removeFromWorld();
                                    ard5.removeFromWorld();
                                });
                                c5.getViewComponent().addOnClickHandler(mouseEvent6 -> {
                                    c5.removeFromWorld();
                                    ard5.removeFromWorld();
                                    Entity c6 = spawn("cl6");
                                    Entity ard6 = spawn("arrowD");
                                    ard6.getViewComponent().addOnClickHandler(mouseEvent7 -> {
                                        c6.removeFromWorld();
                                        ard6.removeFromWorld();
                                    });
                                    c6.getViewComponent().addOnClickHandler(mouseEvent7 -> {
                                        c6.removeFromWorld();
                                        ard6.removeFromWorld();
                                        Entity cf = spawn("cf");
                                        Entity ardf = spawn("arrowD");
                                        ardf.getViewComponent().addOnClickHandler(mouseEvent8 -> {
                                            cf.removeFromWorld();
                                            ardf.removeFromWorld();
                                        });
                                        cf.getViewComponent().addOnClickHandler(mouseEvent8 -> {
                                            cf.removeFromWorld();
                                            ardf.removeFromWorld();
                                        });
                                    });
                                });
                            });
                        });

                    });
                });
            });
        });
    }
}
